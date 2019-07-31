Feature: Login functionality
  
  Description: Registered user login to the application by entering valid username and password
  
  Mapping: John would like access the online shopping page. He should be registered and should use regustered credentials to get logged in to the application

  Background: Display Welcome
    Given display welcome message

  Scenario Outline: Login with valid data
    Given user opens testme application on chrome browser
    When user enters username as "<username>" and password as "<password>"
    And click on Login button
    Then verify it displays Home page

    Examples: 
      | username | password    |
      #|Lalitha|Password123|
      | Admin    | Password456 |
