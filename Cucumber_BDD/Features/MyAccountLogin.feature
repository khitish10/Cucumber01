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
  #Scenario: Login with valid Username and Password
  #Given Open browser
  #When Enter URL "https://practice.automationtesting.in/"
  #And Click on MyAccount menu
  #And Enter registered username "khitish10@gmail.com" and password "Wuwwy4321l@ve"
  #And Click on login button
  #hen User logs in successfully
  
  
  #Login test by passing multiple parameter->>data driven testing using Scenario outline and Examples
  #Scenario Outline: Login with valid Username and Password
    #Given Open browser
    #When Enter URL "https://practice.automationtesting.in/"
    #And Click on MyAccount menu
    #And Enter registered username "<username>" and password "<password>"
    #And Click on login button
    #Then Verify Login

    #Examples: 
      #| username            | password      |
      #| pankaj123@gmail.com | Mt6ty4321l@ve |
      #| dipreety3           | ttttt4321l@ve |
      #| khitish10@gmail.com | Wuwwy4321l@ve |
      
      
#Login test by passing single parameter->>data driven testing using Data Tables
  #Scenario: Login with valid Username and Password
  #Given Open browser
  #When Enter URL "https://practice.automationtesting.in/"
  #And Click on MyAccount menu
  #And Enter registered username and password
  #|	khitish10@gmail.com	|	Wuwwy4321l@ve	|
  #And Click on login button
  #Then User logs in successfully
  
#Login test by passing multiple parameter->>data driven testing using Data Tables
  Scenario: Login with valid Username and Password
  Given Open browser
  When Enter URL "https://practice.automationtesting.in/"
  And Click on MyAccount menu
  And Enter registered username and password
  |	username						|	password			|
  |	khitish10@gmail.com	|	Wuwwy4321l@ve	|
  And Click on login button
  Then User logs in successfully
      
      
      
      
      
      
      
      
 
