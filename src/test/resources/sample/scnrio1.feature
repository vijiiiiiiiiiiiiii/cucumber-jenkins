Feature: Login functionality

Description: Registered user login to the application by entering valid username and password

Mapping: John would like access the online shopping page. He should be registered and should use regustered credentials to get logged in to the application

Scenario: Login with valid data

Given user opens newtours application on chrome browser

When user enters username as "mercury" and password as mercury

And click on SignIn button

Then verify login result as success


Scenario: Login with invalid data

Given user opens newtours application on chrome browser

When user enters username as "mercury123" and password as mercury

And click on SignIn button

Then verify login result as success

