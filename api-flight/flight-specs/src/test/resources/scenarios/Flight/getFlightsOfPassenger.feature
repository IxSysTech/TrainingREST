Feature: Getting all flights for user

  Background:
    Given there a User API server

  Scenario: Get all flights for an existing passenger
    Given I have an existing passenger id
    When I POST it to the /flight/passenger endpoint
    Then I receive a 200 status code

  Scenario: Get all flights for a none existing passenger
    Given I have a none existing passenger id
    When I POST it to the /flight/passenger endpoint
    Then I receive a 404 status code
