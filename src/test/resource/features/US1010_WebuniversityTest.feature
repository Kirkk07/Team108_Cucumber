Feature: US1010 WebUniversity Testi
@wip
  Scenario: TC14 Webuniversity Sayfasinda istenen gorevleri yapar

    Given kullanici "webUrl" anasayfaya gider

    Then Login Portal gorununceye kadar asagi iner
    And Login Portal butonuna tiklar
    And acilan ikinci window'a gecer
    And Username kutusuna deger yazdirir
    And Password kutusuna deger yazdirir
    And 3 saniye bekler
    Then webUniversity login butonuna basar
    And 3 saniye bekler
    And Popup'ta cikan yazinin validation failed oldugunu test eder
    And Ok diyerek Popup'i kapatir
    Then Ilk sayfaya geri doner

    And tum sayfalari kapatir
