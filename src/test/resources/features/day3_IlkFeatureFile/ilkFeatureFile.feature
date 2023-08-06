Feature: US001 Amazon Sayfasi Testi
  Scenario: TC01 Arama kutusunda urun aratma
    Given kullanici amazon sayfasina gider
    Then kullanici aramakutusunda iphone aratir
    And sayfayi kapatir

    Scenario:  TC02 Arama Kutusunda urun aratma
      Given kullanici amazon sayfasina gider
      Then kullanici aramakutusunda samsung aratir
      And sayfayi kapatir
      #calıstırmadan once yukarıdaki cekice bas build project yap
