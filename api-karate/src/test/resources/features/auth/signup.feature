@signup
Feature: Registro de usuarios

  Background: Initial configuration
    * url "https://api.demoblaze.com/signup"
    * header Content-Type = 'application/json'
    * def usersData = read('../../data/users.json')
  @signupCorrecto
  Scenario: TC-02 - Crear un nuevo usuario exitosamente
    * def uniqueStamp = new Date().getTime()
    * def newUser = usersData.newUser
    * def uniqueUsername = newUser.username + '_' + uniqueStamp

    Given request {username: "#(uniqueUsername)", password: "#(newUser.password)"}
    When method post
    * print response
    Then status 200
    And match response.message == 'User created successfully'

  @signupUsuarioExiste
  Scenario: TC-03 - Crear un usuario que ya existe
    * def uniqueStamp = new Date().getTime()
    * def newUser = usersData.newUser
    * def uniqueUsername = newUser.username + '_' + uniqueStamp

    # Crear nuevo usuario
    Given request {username: "#(uniqueUsername)", password: "#(newUser.password)"}
    When method post
    Then status 200

    # Intentar crear el mismo usuario
    Given request {username: "#(uniqueUsername)", password: "#(newUser.password)"}
    When method post
    * print response
    Then status 400
    And match response.errorMessage == 'This user already exist.'

  @signupContraVacia
  Scenario: TC-06 - Crear un usuario con contrseña vacía
    * def uniqueStamp = new Date().getTime()
    * def newUser = usersData.noPwdUser
    * def uniqueUsername = newUser.username + '_' + uniqueStamp

    Given request {username: "#(uniqueUsername)", password: "#(newUser.password)"}
    When method post
    * print response
    Then status 400
    And match response.error.message contains 'password'
