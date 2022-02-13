Feature: To validate Login Functionality of FaceBook Apllication

  @regression
  Scenario: To validate login with invalid username and innvalid password
    Given User needs to be in login page
    When User should enter invalid username and invalid password
    And User Clicks login Button
    Then User will redirect invalid credentail page

  @iteration
  Scenario: To validate login with empty username and empty password
    Given User should be in login page
    When User clicks the login button
    Then User will navigate invalid credintail pages
