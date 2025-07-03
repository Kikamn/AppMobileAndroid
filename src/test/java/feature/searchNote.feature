Feature: Search Note

  Scenario: Search Not Found
    Given The color is opened
    When I click icon search
    And I input "kika"
    Then Will show "No results found"

  Scenario: Search Found
    Given The color is opened
    When I click icon search
    And I input "coba"
    Then Will show all data

  Scenario: Search Found and show detail note
    Given The color is opened
    When I click icon search
    And I input "coba"
    And I Click Note
    Then Will show detail note

  Scenario: Search Found and delete permanent
    Given The color is opened
    When I click icon search
    And I input "coba"
    And I Click Note
    And I Click Button More
    And I Click Permanatly delete
    And Will Show delete confirmasion oke
    Then Will show all data in search


