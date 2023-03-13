Feature: US1006 Kullanici Scenerio outline ile bir den fazla kelime aratir.

  Scenario Outline: TC10 Amazon coklu urun testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazonda "<kelimeler>" icin arama yapar
    And sonuclari "<kelimeler>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      |kelimeler|
      |Nutella|
      |Java|
      |Samsung|
      |Aplle  |
      |Furkan |