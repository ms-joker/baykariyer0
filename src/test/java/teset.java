import kariyer.pages.OpenPositionsPage;
import kariyer.utilities.ConfigurationReader;
import kariyer.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class teset {

    public static void main(String[] args) throws InterruptedException {

        OpenPositionsPage openPositionsPage = new OpenPositionsPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("op_url"));

        openPositionsPage.searchInput.sendKeys("elek");
        Thread.sleep(1000);
        List<WebElement> checkBoxes = Driver.getDriver().findElements(By.xpath("//input[@class='form-check-input']//ancestor::li[not(@style='display: none;')]"));

        int num = 0;
        for (WebElement checkBox : checkBoxes) {
            if (checkBox.isEnabled()) {
                System.out.println("Displayed checkBox = " + checkBox.getText());
                num ++;
            }
        }
        System.out.println("num = " + num);
        Thread.sleep(1000);

        //Driver.closeDriver();
    }

}
