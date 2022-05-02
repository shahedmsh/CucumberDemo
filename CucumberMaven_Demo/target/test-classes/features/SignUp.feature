@tag
Feature: Testing the apple vacations application

  @tag1
  Scenario: SignUp Error Message Testing
    Given Open the Application
    And Redirct to the SignUp page
    When Click on the create account button without entring the values
    Then Get the error message
    
     @tag2
  Scenario: SignUp Error Message Testing
    Given Open the Application
    And Redirct to the SignUp page
    When Click on the create account button with valid email values
    Then Get the error message