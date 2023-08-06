Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir

    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |

     #Scenari Outline: kullanımı testNG deki data provider mantığıyla aynı çalışır.
#Yukarıdaki örnekteki gibi birden fazla veriyi loop kullanmadan test edebiliriz.
#Scenario Outline kullanımında Examples yapısını kendimiz yazmamıza gerek,
#Scnario Outline yazdığımız zaman altını kırmızı çizer ve mause ile üzerine geldiğimizde
#Example yapısını create edebiliriz.


