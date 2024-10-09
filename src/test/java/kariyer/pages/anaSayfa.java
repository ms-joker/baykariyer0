package kariyer.pages;

import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class anaSayfa {
    public anaSayfa() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

}
