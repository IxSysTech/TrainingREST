Feature: Create a booking

  Background:
    Given there a User API server

  Scenario: Create a booking
    Given I have a valid booking payload
    When I POST it to the /booking endpoint
    Then I receive a 200 status code