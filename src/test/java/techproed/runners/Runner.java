package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(plugin = {"pretty",
                            "html:target/default-cucumber-reports.html",
                            "json:target/json-reports/cucumber1.json",
                            "junit:target/xml-report/cucumber.xml",
                            "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttiğimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@pozitif",
        dryRun = false,//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki çıktılar tek renk(siyah) olur

)
/*
@CucumberOptions() notasyonuna parametre olarak
        features-->features package'ının yolunu belirtiriz(Content Root)
        glue-->stepdefinition package(source root)
        tags-->çalıştırmak istediğimiz scenarioları bu parametrede belirtiriz

@CucumberOptions() notasyonu scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı
seçenekleri bu notasyonda belirtiriz

@CucumberOptions() notasyonu içerisine plugin parametresi ile yukarıdaki gibi almak istediğimiz
rapor çeşidini seçip ekliyoruz.
pretty-->konsolda çalıştırdığımız scenario ile ilgili ayrıntılı bilgi verir.
 */


public class Runner {
}
/*
@CucumberOptions() notasyonuna parametre olarak
            features--> packege'ın yolunu
            glue-->stepdefinition package
            tag-->çalıştırmak istediğimiz scenariolari burda belirtiriz
    Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı seçenekleri bu notasyonda
belirtiriz
Cucumber HTML Report:

pretty: Runner'da calistirma yapilinca senaryo hakkinda detayli bilgiler verir

Feature US001de @g tagi ekledik ve ayrica Runner'da tags=@g tagini ekledik ve calistirdik.
Daha sonra @CucumberOptions icinde plugin={"Prety"} yazdiktan sonra calistirdik. Console'da @g tagina sahip senaryo hakkinda daha fazla detay oldugunu gorduk.

Runner'da,
"pretty" den sonra bir virgul koyduk ve devaminda
"html:target/default-cucumber-reports.html",  //ikinci bir rapor almak istersek rapor ismini reports gibi reports2.html
"json:target/json-reports/cucumber.json",
"junit:target/xml-report/cucumber.xml" yazdik.
@g tagina ait senaryoyu calistirdik.
monochrome=true dersek console'daki stepler tek renk olur
monochrome=false dersek bilgiler renkli gelir


Biz detayli raporu sadece Runner'da calistirinca alabildik. Hangi tagli hangi senaryo calistirildigi detayli olarak console'da goruldu.Stepler prety ile renkli goruldu. Ayrica stepDefinition'daki methoda kadar gorebildik.
Runner'da hagi senaryoyu calistirmak istersek tagini belirtip run edince raporu target altinda ismi ile birlikte gorduk. Bu rapor uzerine gelip cift tikladik ve Open In, Browser ve Chrome ile actirdik
Acilan sayfada tum feature'i stepleri ile birlikte gorduk. Ayrica yesil tickli dosya yolunu link gibi gosteren kismi da gorduk.
console'da raporun https://reports.cucumber.io dan alinip paylasilabilecegi soylendigi gibi ayrica bir dosya yolu verildigini gorduk. src/test/resources/cucumber.properties:
Biz de ikinci resources altinda bir cucumber.properties olusturduk.
console'da src/test/resources/cucumber.properties: karsisinda yazili olan cucumber.publish.enabled=true
yazisini kopyalayip cucumber.properties dosyamiz icine yapistirdik. Save All yaptik File'dan.

CUCUMBER_PUBLISH_TOKEN=ba58f2c0-536c-4eda-98a4-e19ff328bc9e cucumber.properties icine yapistirdik. Daha sonra
US001_TechproTesti.feature'da TC03'u clasitirdik. Console'da View your Cucumber Report at:
https://reports.cucumber.io/reports/..... seklinde bir link gorduk. O linke tikladik. reports.cucumber.io'da raporumuzu gorduk. Raporda testin bir dakika once gectigi yazili ve sag ust kosede Log in with GitHub'i gorduk.
Buna tikladik.sag ust kosede Log out yazisina donustu bu github ile baglanti kurdugumuz anlamina gelir.
Raporumuz ayni sekilde gorulmeye devam etti. Alt kisimda file:///ve devaminda tam dosya yolumuz yazildi.
Ust tarafta mavi butonlu Create a collection to keep your reports forever and easily share them yazisina tikladik.Cikan sayfada Name kismina B151Cucumber yazdik ve create new collection'a tikladik. Bize bir TOKEN verdi.
CUCUMBER_PUBLISH_TOKEN=ba58f2c0-536c-4eda-98a4-e19ff328bc9e (bu hepimizde farkli cikabilir) Bunu kopyalayip cucumber.properties dosyamiza yapistirdik.
Biz bu islemleri yaptiktan sonra bir feature dosyamiz icine gelip calistirdik ve console'da yine View your Report altindaki linke tikladik. Raporumuzu gorduk. Raporun /B151Cucumber / icinde TOKEN numaralari ile
kaydedildigini ust kisimda gorduk. file dosya yolu  ve delete report altinda stepleri detayli bir sekilde gorduk. Raporu istemezsek kirmizi renkli Delete Report'dan silebiliriz.

Bu raporlara github'dan nasil ulasabiliriz? GitHub hesabimiza girdik. ismimizin oldugu logoyu tikladik. Settings,
Applications ve Authorized OAuth Apps'e tiklayinca cikanlra arasinda Cucumber Reports'a tikliyoruz.
Developed by yazan kisim yaninda https://reports.cucumber.io'ya tikliyoruz.Olusturdugumuz collectionlar geliyor ve az once yaptigimiz B151Cucumber collection'a tikliyoruz. file dosya yolu altinda Raporumuzu goruyoruz.
 */
