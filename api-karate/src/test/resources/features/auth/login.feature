@login
Feature: Login de usuarios
  Background: Inicialización de precondiciones
    * url "https://api.demoblaze.com/"
    * header Content-Type = 'application/json'
    * def usersData = read ("../../data/users.json")
    * def timeStamp = new Date().getTime()
    * def registeredUser = usersData.existingUser
    * def uniqueUser = registeredUser.username + '_' + timeStamp

  @loginCorrecto
  Scenario: TC-04 - Iniciar sesión con usuario y contraseña correctos
    # Crear un usuario nuevo
    Given path 'signup'
    And request {username: "#(uniqueUser)", password: "#(registeredUser.password)"}
    When method post
    Then status 200

    # Iniciar sesión con las credenciales de ese usuario
    Given path "login"
    And request {username: "#(uniqueUser)", password: "#(registeredUser.password)"}
    When method post
    Then status 200
    * print response
    And match response != null

  @loginIncorrecto
  Scenario: TC-05 - Iniciar sesión con usuario y contraseña incorrectos
    # Crear un usuario nuevo
    Given path 'signup'
    And request {username: "#(uniqueUser)", password: "#(registeredUser.password)"}
    When method post
    Then status 200

    # Intentar iniciar sesión con las credenciales de ese usuario
    Given path "login"
    And request {username: "#(uniqueUser)", password: "BBPassKey15"}
    When method post
    Then status 401
    * print response
    And match response.errorMessage == 'Wrong password.'