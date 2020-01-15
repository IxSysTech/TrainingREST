Feature: Update a flight

  Background:
    Given there a User API server

  Scenario: UPdate a none existing flight by id
    Given I have a invalid flight payload and id
    When I PUT it to the /flight endpoint
    Then I receive a 404 status code