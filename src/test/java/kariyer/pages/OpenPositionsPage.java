package kariyer.pages;

import kariyer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenPositionsPage {

    public OpenPositionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //açık pozisyonlar sayfasındaki arama giriş kutusunu buluyor.
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchInput;

    //Staj checkbox buluyor
    @FindBy(xpath="(//input[@class='form-check-input2'])[1]")
    public WebElement stajCheckBox;

    //iş check box buluyor
    @FindBy(xpath = "(//input[@class='form-check-input2'])[2]")
    public WebElement isCheckBox;
}
