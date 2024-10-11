Feature: mainPage feature

  Background: user on kariyer page
    Given user on main page

  Scenario Outline: User can navigate through navbar
    When user click "<navbar>" element
    Then page contains "<information>"
    Examples:
      | navbar           | information                |
      | AÇIK POZİSYONLAR | acik-pozisyonlar           |
      | STAJ             | staj                       |
      | S.S.S            | sss                        |
      | BAYKAR           | https://baykartech.com/tr/ |
      | GİRİŞ            | login                      |

  Scenario: User can change language
    When user click language button
    Then page change to next language