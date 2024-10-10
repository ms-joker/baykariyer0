Feature: open position page features
  //açık pozisyonlar sayfası için 3 farklı senaryo oluşturuldu.
  Given user on open-position page

  Scenario: user can filter by entering keyword
  //1.senaryo: filtre giriş kutusunu kullanarak filtreleme yapma
    When user enter "keyword" in filter input area
    Then listed jobs will change accordingly

  Scenario: user can change job list by checking staj checkbox
  //2.senaryo: staj kutucuğunu seçerek pozisyonları görme
    When user checks staj checkbox
    Then listed jobs will change accordingly

  Scenario: user can change job list by checking iş checkbox
  //3.senaryo: iş kutucuğunu seçerek pozisyonları görme
    When user checks job checkbox
    Then listed jobs will change accordingly