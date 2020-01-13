Feature: Change user password

  Background:
    Given there a User API server

  Scenario: Change password with good old password
    Given I have an existing user email with a good old password and a new password
    When I POST it to the /user/changePassword endpoint
    Then I receive a 201 status code

  Scenario: Change password with a invalid old password
    Given I have an existing user email with an invalid old password and a new password
    When I POST it to the /user/changePassword endpoint
    Then I receive a 400 status code