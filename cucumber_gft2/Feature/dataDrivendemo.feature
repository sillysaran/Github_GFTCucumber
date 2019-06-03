Feature: Login Action
Scenario Outline: Successful login with valid credentials
Given User open th application
When User click on Sign in button 
And User enters "<username>" and "<password>"
Then Message displayed login is Suuccessful
Examples:
  |username|password|
  |lalitha|password123|
  |admin|password456|