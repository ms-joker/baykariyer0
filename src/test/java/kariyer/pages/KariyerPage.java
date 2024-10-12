package kariyer.pages;

import kariyer.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KariyerPage {

    public KariyerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //NavBar elementleri için element yazılarından bulma fonkisyonu tanımlar
    public WebElement getElement(String linkText){
        return Driver.getDriver().findElement(By.linkText(linkText));
    }

    //Dil değiştirme butonu için WebElement oluşturur.
    @FindBy(xpath = "//li[@class='nav-item  top-btn ']/a")
    public WebElement languageBtn;




}
