Feature: Automation clolor Note

  Scenario: Add Note
    Given The color is opened
    When I Click add buttton
    And I click Text
    And I add task "coba note"
    And I click ceklis button
    And I Click back button
    Then The task "coba note" is displayed

  Scenario: Delete Note which has existed
    Given The color is opened
    When I Click Note which has existed "coba note"
    And I Click Button More
    And I Click Delete
    And Will Show delete confirmasion oke
    Then Will show empty note

