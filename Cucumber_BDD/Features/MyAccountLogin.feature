Feature: MyAccount Login feature
Description: This feature will test the login functionality

Scenario: Login with valid Username and Password
Given Open browser
When Enter URL "https://practice.automationtesting.in/"
And Click on MyAccount menu
And Enter registered username and password
And Click on login button
Then User logs in successfully