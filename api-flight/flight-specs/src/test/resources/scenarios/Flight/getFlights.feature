Feature: Getting all flights

  Background:
    Given there a User API server

  Scenario: Get all existing flights
    Given Given I have a page size and number
    When I GET it to the /flight endpoint
    Then I receive a 200 status code