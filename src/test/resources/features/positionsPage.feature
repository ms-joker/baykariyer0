Feature: open position page features

  Scenario: user can filter by entering keyword
    Given user on open-position page
    When user enter keyword in filter input area
    Then listed positions will change accordingly