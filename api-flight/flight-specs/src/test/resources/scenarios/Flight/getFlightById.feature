Feature: Getting a flight

  Background:
    Given there a User API server

  Scenario: Get an existing flight by id
    Given I have an existing flight id
    When I POST it to the /flight/id endpoint
    Then I receive a 200 status code

  Scenario: Get a none existing flight by id
    Given I have a none existing flight id
    When I POST it to the /flight/id endpoint
    Then I receive a 404 status code