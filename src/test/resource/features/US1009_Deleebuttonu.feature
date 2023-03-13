Feature: US1009 Herokuapp implicitly wait

  Scenario: TC13 kullanici implicitly wait ile gorevleri yapabilmeli

    Given kullanici "herokuUrl" anasayfaya gider
    Then AddElement butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder


