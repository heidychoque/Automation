Feature: Contact Us page design

  Background: Preconditions
    Given Load home page
    And Wait implicit time
    And window is maximized
    And Click ContactUs button on navbar

  Scenario: Verify existence of parallax components on Contact Us Page
    Then  Verify existence of Parallax on Contact Us page
    And Verify existence of label Title on Contact Us parallax

  Scenario: Verify existence of components on Our Offices section
    When Verify existence of label Our Offices
    Then Verify existence of Map section
    And Verify existence of Contact section

  Scenario: Verify existence of components on Contact section
    Then Verify existence of label Contact Us title
    And Verify existence of description labels
    And Verify existence of text field Name
    And Verify existence of text field Email
    And Verify existence of text field Message
    And Verify existence of button Send

  Scenario: Verify functionality of Contact section sending a valid email,text field, message
    And Send correct text to text field Name
    And Send correct email to text field Email
    And Send correct message to text field Message
    And Verify if Send button esta habilitado
    And Click Send button
    And Verify success snackbar

  Scenario: Verify functionality of Contact section sending a incorrect email, correct text field, correct message
    And Send correct text to text field Name
    And Send incorrect email to text field Email
    And Send correct message to text field Message
    And Verify if Send button is disabled

  Scenario: Verify functionality of Contact section sending a correct email, incorrect text field, correct message
    And Send incorrect text to text field Name
    And Send correct email to text field Email
    And Send correct message to text field Message
    And Verify if Send button is disabled

  Scenario: Verify functionality of Contact section sending a correct email, correct text field, incorrect message
    And Send correct text to text field Name
    And Send correct email to text field Email
    And Send incorrect message to text field Message
    And Verify if Send button is disabled









