package kariyer.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kariyer.pages.KariyerPage;
import kariyer.utilities.ConfigurationReader;
import kariyer.utilities.Driver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KariyerPage_stepDefinition {

    KariyerPage kariyerPage = new KariyerPage();



    @Given("user on main page")
    public void user_on_main_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("b_url"));
        Thread.sleep(2000);
    }

    @When("user click navbar element")
    public void user_click_navbar_element() throws InterruptedException {
        List<WebElement> NavBarElements = kariyerPage.kariyerNavbar;
        for (WebElement element : NavBarElements) {
            element.click();
            Thread.sleep(2000);

        }
    }

    @Then("page will go to element page")
    public void page_will_go_to_element_page() {

    }
    @When("user click language button")
    public void user_click_language_button() throws InterruptedException {
        kariyerPage.languageBtn.click();
        Thread.sleep(1000);


    }
    @Then("page change to next language")
    public void page_change_to_next_language() {
        if (kariyerPage.languageBtn.getText() == "EN"){
            kariyerPage.languageBtn.click();
        }
    }

}
