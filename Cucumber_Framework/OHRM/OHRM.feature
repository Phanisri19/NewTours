
Feature: Orange HRM Application Testing
Scenario Outline: Validating LogIn Functionality of OrangeHRM Application

Given Open the Chrome Browser and navigate to OrangeHRM application
When User Enters "<UserName>" and "<Password>" and click on login button
Then User should be able to login and close the application

Examples:

| UserName | Password |
| admin    | Password |
| hello    | Password |