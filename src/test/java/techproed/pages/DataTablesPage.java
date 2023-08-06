package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DataTablesPage {


    public DataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement newButon;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;


    @FindBy(xpath = "(//button)[4]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='sorting_1'])[1]")
    public WebElement searchVerify;

}
