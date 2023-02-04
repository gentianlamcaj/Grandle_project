package stepDef;


import Page.EtsyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.Driver;

public class EtsyTitleVerification_StepDefinitions {

    EtsyPage etsy=new EtsyPage();
    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User sees title is {string}")
    public void user_sees_title_is(String expectedTitle) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User types {string} in the search box")
    public void user_types_in_the_search_box(String keyword) {
        etsy.searchBox.sendKeys(keyword);

    }
    @Then("User clicks search button")
    public void user_clicks_search_button() {
        etsy.searchButton.click();

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {

        String actualTitle=Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
