package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlloverPage {
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement anasayfaSigninButon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameEmailAddress;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement password;
    @FindBy(css = "[name=login]")
    public WebElement signInButton;
}
