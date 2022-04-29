package com.aoe.stepDefinitions;

import com.aoe.utilities.ConfigurationReader;
import com.aoe.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import com.aoe.utilities.Driver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VacanciesSteps {

    @Given("The User opens the webpage")
    public void the_user_opens_the_webpage() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get().get(ConfigurationReader.get("url"));
//        driver.manage().window().maximize();
//        System.out.println("Web Site is opened");

        Driver.get().get(ConfigurationReader.get("url"));


    }
    @Given("The User Navigates to the {string} page of the {string} section")
    public void the_user_navigates_to_the_page_of_the_section(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The User writes {string} as keyword")
    public void the_user_writes_as_keyword(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Check the returned list for the keyword")
    public void check_the_returned_list_for_the_keyword() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Open the first entry which is displayed")
    public void open_the_first_entry_which_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Check the content of this job offering is being displayed.")
    public void check_the_content_of_this_job_offering_is_being_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
