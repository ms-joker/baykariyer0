package kariyer.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kariyer.pages.KariyerPage;
import kariyer.utilities.ConfigurationReader;
import kariyer.utilities.Driver;
import org.junit.Assert;

public class KariyerPage_StepDefinition {

    KariyerPage kariyerPage = new KariyerPage();

    @Given("user on main page") //ana sayfa
    public void user_on_main_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("b_url"));
        Thread.sleep(2000);
    }

    @When("user click {string} element")
    public void user_click_element(String navbar_element) throws InterruptedException {
        kariyerPage.getElement(navbar_element).click();
        Thread.sleep(500);
    }

    @Then("page contains {string}")
    public void page_contains(String info) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(info));
    }

    @When("user click language button")
    public void user_click_language_button() throws InterruptedException {
        kariyerPage.languageBtn.click();
        Thread.sleep(1500);
    }

    @Then("page change to next language")
    public void page_change_to_next_language() {
        if (kariyerPage.languageBtn.getText().equals("EN")){
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("tr/"));
        } else if (kariyerPage.languageBtn.getText().equals("TR")) {
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("en/"));
        }
    }

}
