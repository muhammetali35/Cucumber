@erol
Feature: US004 TechproEducation Arama Testi
  @parametre
  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Given kullanici "https://techproEducation.com" sayfasina gider
    Then arama kutusunda "mobile" aratir
    And kullanici 2 saniye bekler
    But cikan dropdown menuden mobile developer secenegini tiklar
    And kullanici 1 saniye bekler
    And basligin "Mobile" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Google sayfasina gidilir
    Given kullanici "https://google.com" sayfasina gider

  Scenario: TC03 Facebook sayfasina gidilir
    Given kullanici "https://facebook.com" sayfasina gider

  Scenario: TC04 Techpro sayfasina gidilir Java aratilir
    Given kullanici "https://techproEducation.com" sayfasina gider
    Then arama kutusunda "java" aratir
    And sayfayi kapatir
