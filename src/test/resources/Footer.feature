Feature: Footer feature
  Background: Preconditions
    Given Load home page
    And window is maximized

  Scenario: Verify Footer section design
    When Verify existence of footer
    Then Verify  existence of label Menu
    And Verify existence of About Us button on footer
    And Verify existence of Activities button on footer
    And Verify existence of Contact us button on footer
    When Verify existence of label WIT
    Then Verify existence of Address label
    And Verify existence of Phone label
    And Verify existence of email label
    And Verify existence of Facebook button
    And Verify existence of Twitter button
    And Verify existence of Instagram button
    And Verify existence of Linkedin button
    And Verify existence of Youtube button
    And Verify alignment of label title of Sign in section
    And Verify existence of text field
    And Verify existence of Sign Up button

  Scenario: Verify Facebook Social networks buttons
    Then Click Facebook button

  Scenario: Verify Twitter Social networks buttons
    Then Click Twitter button

  Scenario: Verify Instagram Social networks buttons
    Then Click Instagram button

  Scenario: Verify Linkedin Social networks buttons
    Then Click Linkedin button

  Scenario: Verify Youtube Social networks buttons
    Then Click Youtube button

  Scenario:Verify Sign Up buttons with Correct email and checkboxes on backlog and Close button
    When Send Correct email to text field Sign up
    And Click Sign Up button
    And Wait implicit time
    And Verify existence of Activities checkbox
    And Verify existence of News checkbox
    And Verify existence of Contests checkbox
    And Verify existence of Curiosities checkbox
    And Click Activities checkbox
    And Click News checkbox
    And Click Contests checkbox
    And Click Curiosities checkbox
    And Verify existence of close button on dialog of interest
    And Click Close button on dialog of interest

  Scenario: Verify Sign Up button with incorrect email,error backlog and close button
    When Send Incorrect email to text field Sign up
    And Click Sign Up button
    Then Dialog of error must be showed
    And Click Close button on dialog of error


