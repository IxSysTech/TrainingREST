Feature: Getting a user

  Background:
    Given there a User API server

  Scenario: Get an existing user by email
    Given I have an existing user email
    When I GET it to the /user/email endpoint
    Then I receive a 200 status code

  Scenario: Get a none existing user by email
    Given I have a none existing user email
    When I GET it to the /user/email endpoint
    Then I receive a 400 status code