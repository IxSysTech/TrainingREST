Feature: Create a passenger

  Background:
    Given there a User API server

  Scenario: Get an existing passenger
    Given I have a valid passenger payload
    When I POST it to the /flight endpoint
    Then I receive a 200 status code