Feature: Tags in Cucumber

@SanityTest @RegressionTest
Scenario: Verify Login
Given This is a valid login test

@SanityTest @End2End
Scenario: Verify logout
Given This is logout test

@RegressionTest
Scenario: Verify search
Given This is search test

@RegressionTest @End2End
Scenario: Verify advanced search
Given This is advanced search test

@End2End
Scenario: Verify prepaid recharge
Given This is prepaid recharge test

@End2End
Scenario: Verify post prepaid recharge
Given This is post prepaid recharge test