package com.autotrader.Pages;

import com.autotrader.Utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutotraderPage {

    //Locators are here

    @FindBy(xpath = "//button[contains(text(),'Browse by Make')]")
    public WebElement browseByMake;

    @FindBy(xpath = "//button[contains(text(),'Browse by Style')]")
    public WebElement browseByStyle;

    @FindBy(xpath = "//a[contains(text(),'Advanced Search')]")
    public WebElement advanceSearch;

    @FindBy(xpath = "//button[@id='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//select[@id='makeCode']")
    public WebElement makeElement;

    @FindBy(xpath = "//select[@id='ModelCode']")
    public WebElement modelElement;

    //for initialize the @FindBy annotations

    public AutotraderPage(){

        PageFactory.initElements(MyDriver.get(),this);
    }
    public void verification(String expected){

        if (expected.equals(browseByMake.getText())){
            String actual = browseByMake.getText();
            Assert.assertEquals(expected,actual);

        }else if (expected.equals(browseByStyle.getText())){

            String actual = browseByStyle.getText();
            Assert.assertEquals(expected,actual);

        }else {

            String actual = advanceSearch.getText();
            Assert.assertEquals(expected,actual);
        }

    }
}






