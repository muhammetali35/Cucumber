Feature: US001 Google Sayfasinda Urun Aratma
  Scenario: TC01 Tablo Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici verilen bilgiler ile arama yapar
      | Urunler  |
      | nokia    |
      | samsung  |
      | iphone   |
      | motorola |
    And sayfayi kapatir


#DataTable Scenariodaki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir.
#Scenario Outline'an farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz.
#Tabloyu olusturdugumuz step'in methoduna parametre olarak io.cucumber'dan DataTable parametresini ekleriz.
#Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list'e donusturup loop ile verileri kullanabiliriz.
#Birden fazla olusturduysak yine DataTable parametresi sayesinde excel'den bildigimiz row() methodu ile bu datalara ulasabiliriz.


    #Altgr+<> --> |