Feature: login feature

  Scenario: User enters Username and Password
    Given the login page is opened
    When the user enters lalitha as username
    And user enters password123 as password
    Then user will finds TestMe App Home Page
