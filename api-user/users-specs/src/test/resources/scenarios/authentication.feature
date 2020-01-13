Feature: Authenticate to the application

  Background:
    Given there a User API server

  Scenario:
    Given I have an existing user email and password
    When I POST it to the /user/authentication endpoint
    Then I receive a 201 status code and a token

  Scenario:
    Given I have a none existing user email and password
    When I POST it to the /user/authentication endpoint
    Then I receive a 400 status code