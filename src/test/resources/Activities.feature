Feature: Activities feature
  Background:  Preconditions
    Given Load home page
    And Wait implicit time
    And window is maximized
    And Click Activities button on navbar

  Scenario: Verify existence of parallax components on Activities page
    Then  Verify existence of Parallax on Activities page
    And Verify existence of label Title on Activity parallax
    And Verify existence of description on Activity parallax

    Scenario: Verify components of Activities section
      Then Verify existence of image of each Activities section
      And Verify existence of title of each Activities section
      And Verify existence of description of each Activities section
      And Verify existence of button of each Activities section




