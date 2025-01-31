Feature: feature to check login functionality

Scenario: check login is successful with valid credentials

Given user is on login page
When user enter username and password
And user click on login button
Then user is navigated to the homapage