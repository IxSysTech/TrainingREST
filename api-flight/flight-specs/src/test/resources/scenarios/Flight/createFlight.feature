Feature: Create a flight

  Background:
    Given there a User API server

  Scenario: Get an existing flight by id
    Given I have a valid flight payload
    When I POST it to the /flight endpoint
    Then I receive a 200 status code

  Scenario: Get a none existing flight by id
    Given I have a invalid flight payload
    When I POST it to the /flight endpoint
    Then I receive a 500 status code