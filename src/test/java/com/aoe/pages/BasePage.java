package com.aoe.pages;

import com.aoe.utilities.BrowserUtils;
import com.aoe.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    public void  acceptCookies(){
        BrowserUtils.waitFor(3);
        WebElement accepCookiesButton = Driver.get().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForClickablility(By.xpath("//button[@id='onetrust-accept-btn-handler']"),10);
        accepCookiesButton.click();
    }

    public void goToSubMenu(String mainMenuElementName, String subMenuElementName){
        WebElement menuIcon =Driver.get().findElement(By.xpath("(//a[@href='#'])[1]"));
        menuIcon.click();
        BrowserUtils.waitFor(3);
        System.out.println("menu icon tıklandı");
        WebElement mainMenuWebElement = Driver.get().findElement(By.xpath("//a[.=' "+mainMenuElementName+" ']"));
        mainMenuWebElement.click();
        System.out.println("main menu element tıklandı");
        BrowserUtils.waitFor(3);
        WebElement subMenuElement =Driver.get().findElement(By.xpath("//a[.=' "+subMenuElementName+" ']"));
        subMenuElement.click();
        System.out.println("sub menu element tıklandı");
    }
}
