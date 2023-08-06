Feature: US001 Allover Commerce signin islemi
  Scenario: TC01 kullanici signin yapar
    Given Kullanici "https://allovercommerce.com" sitesine gider
    Then kullanici signin butonuna tıklar
    And kullanici 2 saniye bekler
    And valid email adresi girer
    And valid sifre girer
    Then signin tıklar
    And sayfayi kapatir

