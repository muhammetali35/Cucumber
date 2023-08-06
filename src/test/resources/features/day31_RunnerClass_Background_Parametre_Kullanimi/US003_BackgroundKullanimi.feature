@hepsi
Feature: US003 TechproEducation Arama Testi
  #Feature file daki scenario'larımızda ortak adımlarımız var ise bunu Feature: yapısından sonra
    #Background: yapısı ile kullanabiliriz. Böylece scenario'dan önce Background: step çalışacaktır.

  Background: Ana Sayfaya Gider
    Given kullanici techproEducation sayfasina gider


  Scenario: TC01 Arama Kutusunda Bolum Aratma
    Then arama kutusunda qa aratir


  Scenario: TC02 Arama Kutusunda Bolum Aratma
    Then arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder


  Scenario: TC03 Arama Kutusunda Bolum Aratma
    Then arama kutusunda java aratir
    But cikan dropdown menuden free java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir

  #Eğer scenariolarımız tek bir browser'da çalışmasını istersek yani her scenario'da
  #kapanmasın istersek sadece en son scenario'da sayfayı kapat step'ini kullanırız.