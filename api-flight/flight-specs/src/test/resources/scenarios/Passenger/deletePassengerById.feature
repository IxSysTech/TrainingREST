Feature: Delete a flight

  Background:
    Given there a User API server

  Scenario: Delete a none existing passenger by id
    Given I have a invalid passenger id
    When I DELETE it to the /passenger/id endpoint
    Then I receive a 404 status code