package com.aoe.stepDefinitions;

import com.aoe.pages.PageVacancies;
import com.aoe.utilities.BrowserUtils;
import com.aoe.utilities.ConfigurationReader;
import com.aoe.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class VacanciesSteps {
 private List<WebElement> results;
 private  String keyWord;
    @Given("The User opens the webpage")
    public void the_user_opens_the_webpage() {
 //       WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get().get(ConfigurationReader.get("url"));
//        driver.manage().window().maximize();
//        System.out.println("Web Site is opened");

       // Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();


    }
    @Given("The User Navigates to the {string} page of the {string} section")
    public void the_user_navigates_to_the_page_of_the_section(String subMenuElementName, String mainMenuElementName ) {
        PageVacancies pv = new PageVacancies();
        pv.acceptCookies();

        pv.goToSubMenu(mainMenuElementName,subMenuElementName);

    }
    @Then("The User writes {string} as keyword")
    public void the_user_writes_as_keyword(String keyWord) {
        this.keyWord= keyWord;
        WebElement keyWordBox = Driver.get().findElement(By.xpath("//input[@id='filter-keyword']"));
        keyWordBox.sendKeys(keyWord);
    }
    @Then("Check the returned list for the keyword")
    public void check_the_returned_list_for_the_keyword() {
        results = Driver.get().findElements(By.xpath("//tr[contains(  translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'"+keyWord+"')]/td/a"));
        System.out.println("size of result: "+results.size());
        Assert.assertNotNull(results);
    }

    @Then("Open the first entry which is displayed")
    public void open_the_first_entry_which_is_displayed() {
        System.out.println("result text ="+results.get(0).getText());
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", results.get(0));
        System.out.println("eneabled :"+results.get(0).isEnabled());
        System.out.println("is displayed :"+results.get(0).isDisplayed());
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(results.get(0),4);
       results.get(0).click();
    }
    @Then("Check the content of this job offering is being displayed.")
    public void check_the_content_of_this_job_offering_is_being_displayed() {
        WebElement content = Driver.get().findElement(By.xpath("//section[@class='bg-light']"));
        Assert.assertNotNull(content.getText());

    }

}