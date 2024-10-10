package kariyer.pages;

import kariyer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KariyerPage {

    public KariyerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[contains(@class, 'nav-link')]")
    public List<WebElement> kariyerNavbar;



}
