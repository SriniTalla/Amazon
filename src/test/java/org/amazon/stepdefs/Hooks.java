package org.amazon.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;

public class Hooks extends BasePage{

    private static final Logger logger = Logger.getLogger(Hooks.class.getName());

    @Before
    public void setup(Scenario scenario){

        ///initialise driver

     BasePage.driver = new ChromeDriver();
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        logger.info("Test Started --> "+scenario.getName());
        this.scenario = scenario;

    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
            logger.info("Test failed "+scenario.getName());
        }else {
            logger.info("Test Pass "+scenario.getName());
        }

        //closing the driver
        if(BasePage.driver!=null){
            BasePage.driver.quit();
        }
    }
}
