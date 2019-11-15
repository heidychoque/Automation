Feature: About Us page design

  Background: Preconditions
    Given Load home page
    And Wait implicit time
    And window is maximized
    And Click About Us button on navbar

  Scenario: Verify Parallax components
    When Verify existence of Parallax on About us
    Then Verify existence of About Us label on parallax
    And Verify existence of description of About Us on parallax
    And Verify existence of Contact us button on parallax

  Scenario: Verify design of Members section
    Then Verify existence of Members label
    And Verify alignment of Members label
    And Verify existence of description of Members
    And Verify alignment of description of Members
    And Verify existence of cards of Members
    And Verify existence of images members
    And Verify existence of name label
    And Verify existence of member Linkedin social button
    And Verify existence of member Twitter social button
    And Verify existence of member Facebook social button

  Scenario:Verify design of Other Communities section
    Then Verify existence of other communities label
    And Verify alignment of other communities label
    And Verify existence of other communities logos
