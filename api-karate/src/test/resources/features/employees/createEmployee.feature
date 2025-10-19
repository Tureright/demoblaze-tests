@createEmployee
Feature: Negative test cases for createEmployee request parameters

  Background: Initial configuration
    * url "https://api.demoblaze.com/signup"
    * header Content-Type = 'application/json'

  Scenario: Test
    Given request {"username": "newUser", "password": "newPassword"}
    When method post
    Then status 200
    * print response