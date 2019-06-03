Feature: Login Action Test

  Scenario: Successful Login with valid credentials
    Given user login page is opened
    When user enters "lalitha" as username and "password123" as password
    When user click on Login button
    Then user will find TestMe App homepage
