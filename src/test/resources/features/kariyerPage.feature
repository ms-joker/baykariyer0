Feature: mainPage feature
  //Burada mainPage diye yazdım.
  //Bu sayfa için 2 senaryo vardır.
  Given user on main page

  Scenario: User can navigate through navbar
  //1.senaryo: NavBar'daki bağlantıların düzgün çalıştığını kontrol etme
    When user click navbar element
    Then page will go to element page


  Scenario: User can change language
  //2.senaryo: sayfa dil değiştirme butonunun çalışmasını kontrol etme
    When user click language button
    Then page change to next language