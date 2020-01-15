Feature: Update a passenger

  Background:
    Given there a User API server

  Scenario: Update a none existing passenger by id
    Given I have a valid passenger payload and an invalid id
    When I DELETE it to the /passenger/id endpoint
    Then I receive a 404 status code