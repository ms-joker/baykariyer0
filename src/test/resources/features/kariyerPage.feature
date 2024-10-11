Feature: mainPage feature

  Background: user on kariyer page
    Given user on main page

  Scenario: User can navigate through navbar

    When user click navbar element
    Then page will go to element page

  Scenario: User can change language
    When user click language button
    Then page change to next language