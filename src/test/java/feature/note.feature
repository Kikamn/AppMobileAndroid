Feature: Automation clolor Note

  Background:
    Given Install the app color note
    And Click next button
    And Click permisson button
    And Click skip button

  Scenario: Add Note
    Given The color is opened
    When I Click add buttton
    And I add task "coba note"
    Then The task "Coba Note" is displayed