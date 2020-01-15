Feature: Delete a flight

  Background:
    Given there a User API server

  Scenario: Delete a none existing flight by id
    Given I have a invalid flight id
    When I DELETE it to the /flight endpoint
    Then I receive a 404 status code