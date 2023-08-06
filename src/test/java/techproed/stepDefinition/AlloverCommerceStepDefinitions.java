package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.AlloverPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AlloverCommerceStepDefinitions {

    AlloverPage page = new AlloverPage();
    @Given("Kullanici {string} sitesine gider")
    public void kullaniciHttpsAllovercommerceComSitesineGider(String url) {
        Driver.getDriver().get(url);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici signin butonuna tıklar")
    public void kullaniciSigninButonunaTiklar() {
        page.anasayfaSigninButon.click();

    }

    @And("valid email adresi girer")
    public void validEmailAdresiGirer() {
        page.userNameEmailAddress.sendKeys(ConfigReader.getProperty("mehtapEmail"));
    }

    @And("valid sifre girer")
    public void validSifreGirer() {
        page.password.sendKeys("mehtapPassword");
    }

    @Then("signin tıklar")
    public void signinTıklar() {
        page.signInButton.click();
    }
}
