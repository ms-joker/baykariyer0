package kariyer.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kariyer.pages.OpenPositionsPage;
import kariyer.utilities.ConfigurationReader;
import kariyer.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class OpenPositionPage_StepDefinition {

    OpenPositionsPage openPositionsPage = new OpenPositionsPage();
    List<WebElement> positionsList = new ArrayList<>();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("user on open-position page")
    public void user_on_open_position_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("op_url"));
        Thread.sleep(2000);
    }

    @When("user enter {string} in filter input area")
    public void userEnterInFilterInputArea(String arg0) {
        openPositionsPage.searchInput.sendKeys(arg0 + Keys.ENTER);
    }

    @When("user checks staj checkbox")
    public void user_checks_staj_checkbox() throws InterruptedException {   // "staj" checkbox tıklıyor.
        js.executeScript("arguments[0].scrollIntoView(true);", openPositionsPage.stajCheckBox);
        Thread.sleep(500);
        openPositionsPage.stajCheckBox.click();
    }

    @When("user checks job checkbox")
    public void user_checks_job_checkbox() throws InterruptedException {    // "iş" checkbox tıklıyor
        js.executeScript("arguments[0].scrollIntoView(true);", openPositionsPage.isCheckBox);
        Thread.sleep(500);
        openPositionsPage.isCheckBox.click();
    }

    @Then("listed jobs will change accordingly")
    public void listed_jobs_will_change_accordingly() throws InterruptedException {
        Thread.sleep(1500);
        //Assert.assertNotEquals(openPositionsPage.pageLink.getText(), "28");

    }


}
