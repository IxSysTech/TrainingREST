Feature: Getting all users

  Background:
    Given there a User API server

  Scenario: Getting all users
    Given I have a page size and number
    When I GET it to the /user endpoint
    Then I receive a 200 status code