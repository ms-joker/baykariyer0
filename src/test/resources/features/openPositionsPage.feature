Feature: open position page features



  Scenario: user can filter by entering keyword
    Given user on open-position page
    When user enter "keyword" in filter input area
    Then listed jobs will change accordingly

  Scenario: user can change job list by checking staj checkbox
    Given user on open-position page
    When user checks staj checkbox
    Then listed jobs will change accordingly

  Scenario: user can change job list by checking iş checkbox
    Given user on open-position page
    When user checks job checkbox
    Then listed jobs will change accordingly