Feature: MyAccount Login feature
Description: This feature will test the login functionality

#Login test without passing parameters
#Scenario: Login with valid Username and Password
#Given Open browser
#When Enter URL "https://practice.automationtesting.in/"
#And Click on MyAccount menu
#And Enter registered username and password
#And Click on login button
#Then User logs in successfully

#Login test by passing parameters
Scenario: Login with valid Username and Password
Given Open browser
When Enter URL "https://practice.automationtesting.in/"
And Click on MyAccount menu
And Enter registered username "khitish10@gmail.com" and password "Wuwwy4321l@ve"
And Click on login button
Then User logs in successfully