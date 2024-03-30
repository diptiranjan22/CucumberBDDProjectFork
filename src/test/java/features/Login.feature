Feature: Login into TutorialNinja Application

Scenario Outline: Login to the Application with valid credentials
    Given I navigate to the Login page
    When I enter email address as "<email>" and password as "<password>" into the fields
    And I click on the login button
    Then the user should be able to successfully login

Examples:
    | emailaddress         | password |
    | user1@example.com    | password123 |
    | user2@example.com    | password456 |
    | user3@example.com    | password789 |



                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   

                   
