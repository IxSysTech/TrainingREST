Feature: Getting a passenger

  Background:
    Given there a User API server

  Scenario: Get an existing passenger by id
    Given I have an existing passenger id
    When I GET it to the /passenger/id endpoint
    Then I receive a 200 status code

  Scenario: Get a none existing passenger by id
    Given I have a none existing passenger id
    When I GET it to the /passenger/id endpoint
    Then I receive a 404 status code