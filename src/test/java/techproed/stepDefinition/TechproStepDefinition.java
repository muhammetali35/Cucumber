package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechproPage techproPage = new TechproPage();
    @Given("kullanici techproEducation sayfasina gider")
    public void kullaniciTechproEducationSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {
        techproPage.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden mobile developer secenegini tiklar")
    public void cikanDropdownMenudenMobileDeveloperSeceneginiTiklar() {
        techproPage.mobileDevLink.click();
        ReusableMethods.bekle(2);
    }

    @And("basligin Mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techproPage.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden free java secenegini tiklar")
    public void cikanDropdownMenudenFreeJavaSeceneginiTiklar() {
        techproPage.freeJavaLink.click();
        ReusableMethods.bekle(2);
    }

    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techproPage.aramaKutusu.sendKeys(str);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
