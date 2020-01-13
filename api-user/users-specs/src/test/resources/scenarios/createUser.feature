Feature: Creation of users

  Background:
    Given there a User API server

  Scenario: create a user
    Given I have a user payload
    When I POST it to the /user endpoint with an admin user
    Then I receive a 201 status code

  Scenario: create a user with a none admin user
    Given I have a user payload
    When I POST it to the /user endpoint with a none admin user
    Then I receive a 400 status code