package com.autotrader.StepDefinitions;

import com.autotrader.Utilities.ConfigurationReader;
import com.autotrader.Utilities.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(){
        System.out.println("##### SETUP! START ######\n");

       // MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MyDriver.get().manage().window().maximize();
        MyDriver.get().get(ConfigurationReader.getProperty("Url"));
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) MyDriver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }else{
            System.out.println("Cleanup!");
            System.out.print("Test Completed! Thumbs Up!");
        }
        System.out.print("########## THE END #############");

        MyDriver.closeDriver();

    }

}
