package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalPagination;
import utils.Driver;
import utils.Waiter;


public class TechGlobalSteps {


    WebDriver driver;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    Actions action;
    TechGlobalPagination techGlobalPagination;



    @Before
    public void setup() {
        driver = Driver.getDriver();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        action = new Actions(driver);
        techGlobalPagination = new TechGlobalPagination();
    }
    @When("user moves to {string} header dropdown")
    public void user_moves_to_header_dropdown(String string) {
        action.moveToElement(techGlobalFrontendTestingHomePage.headerDropdown).perform();
    }

    @When("user clicks on {string} header dropdown option")
    public void user_clicks_on_header_dropdown_option(String string) {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
    }

    @Then("user should be navigated to {string}")
    public void user_should_be_navigated_to(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @And("user clicks on {string} card")
    public void user_clicks_on_card(String string) {
        techGlobalFrontendTestingHomePage.clickOnCard("Pagination");

    }

    @And("user should see {string} heading")
    public void user_should_see_heading(String heading) {
        switch (heading){
            case "Pagination":
                Assert.assertEquals(heading,techGlobalPagination.mainHeading.getText());
                break;
            case "World City Populations 2022":
                Assert.assertEquals(heading, techGlobalPagination.subHeading.getText());
                break;
            default:
               throw new NotFoundException("Heading Text Not Found");
        }

    }

    @And("user should see {string} paragraph")
    public void user_should_see_paragraph(String paragraph) {
        Assert.assertEquals(paragraph, techGlobalPagination.paragraph.getText());
    }



    @And("user should see “Previous” button is disabled")
    public void user_should_see_Previous_button_is_disabled() {
        Assert.assertFalse(techGlobalPagination.previousBtn.isEnabled());

    }

    @And("user should see “Next” button is enabled")
    public void user_should_see_Next_button_is_enabled(){
        Assert.assertTrue(techGlobalPagination.nextBtn.isEnabled());
    }

    @When("user clicks on “Next” button")
    public void user_clicks_on_Next_button() {
        techGlobalPagination.nextBtn.click();
    }

    @Then("user should see “Previous” button is enabled")
    public void user_should_see_Previous_button_is_enabled() {
        Assert.assertTrue(techGlobalPagination.previousBtn.isEnabled());
    }

    @And("user clicks on “Next” button till it becomes disabled")
    public void user_clicks_on_Next_button_till_it_becomes_disabled() {
        while (techGlobalPagination.nextBtn.isEnabled()) {
            techGlobalPagination.nextBtn.click();
        }
    }

    @And("user should see “Next” button is disabled")
    public void user_should_see_Next_button_is_disabled() {
        Assert.assertFalse(techGlobalPagination.nextBtn.isEnabled());
    }




    @And("user should see “Tokyo” city with info below and an image")
    public void user_should_see_Tokyo_city_with_info_below_and_an_image(DataTable dataTable) {
        for (int i = 0; i < techGlobalPagination.cityInfo.size(); i++) {
            Assert.assertEquals(,techGlobalPagination.cityInfo.get(i).getText());
        }
    }

    @And("user should see “Delhi” city with info below and an image")
    public void user_should_see_Delhi_city_with_info_below_and_an_image(io.cucumber.datatable.DataTable dataTable) {

    }

    @And("user should see “Shangai” city with info below and an image")
    public void user_should_see_Shangai_city_with_info_below_and_an_image(io.cucumber.datatable.DataTable dataTable) {

    }

    @And("user should see “Sao Paulo” city with info below and an image")
    public void user_should_see_Sao_Paulo_city_with_info_below_and_an_image(io.cucumber.datatable.DataTable dataTable) {

    }

    @And("user should see “Mexico City” city with info below and an image")
    public void user_should_see_Mexico_City_city_with_info_below_and_an_image(io.cucumber.datatable.DataTable dataTable) {


    }

}