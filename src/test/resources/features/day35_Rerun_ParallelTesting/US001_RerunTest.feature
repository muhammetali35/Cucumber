Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider

  @arc
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Then kullanici arama kutusunda "arac1" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac1" icerdigini test eder
    And sayfayi kapatir
  @arc

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda "arac2" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac2" icerdigini test eder
    * sayfayi kapatir
  @arc

  Scenario: TC03 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda "arac3" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac3" icerdigini test eder
    * sayfayi kapatir
