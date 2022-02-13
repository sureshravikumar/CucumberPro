Feature: To validate Login Functionality of FaceBook Apllication

  Background: 
    Given User needs to be in login page

  @sanity
  Scenario Outline: To validate login with invalid username and innvalid password
    When User should enter invalid "<username>" and invalid "<password>"
    And User Clicks login button
    Then User will redirect invalid credentail page

    Examples: 
      | username | password |
      | Java     | java     |
      | Selenium | selenium |
      | Testing  | testing  |

  @smoke
  Scenario: To validate login with empty username and empty password
    When User clicks the login button
    Then User will navigate invalid credintail pages
