Feature: US002 Google Sayfasi Testi

  @pozitif
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "volvo" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac1" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda "arac2" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac2" icerdigini test eder
    * sayfayi kapatir

  @negatif
  Scenario: TC03 Arama Kutusunda Audi Aratilir
    * kullanici google arama kutusunda "audi" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac3" icerdigini test eder
    * sayfayi kapatir

