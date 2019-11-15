Feature: Navbar Feature

  Background: Preconditions
    Given Load home page
    And window is maximized

  Scenario: Verify if label Women In Technology exists on navbar
    Then Search label Women In Technology

  Scenario: Verify existence of buttons on Navbar
    Then Verify existence of Our Team button
    And Verify existence of Contact Us button
    And Verify existence of Activities button

  Scenario: Verify function of buttons on navbar
    When Click About Us button on navbar
    Then Click WIT button on navbar from About Us
    When Click Activities button on navbar
    Then Click WIT button on navbar fron Activities
    When Click ContactUs button on navbar
    Then Click WIT button on navbar from Contact Us
