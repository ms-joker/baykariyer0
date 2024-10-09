Feature: mainPage feature

  Scenario: User can navigate through navbar
    Given user on main page
    When user click navbar element
    Then page will go to element page


  Scenario: User can change language
    Given user on main page
    When user click language button
    Then page change to next language