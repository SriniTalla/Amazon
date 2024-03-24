package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.amazon.pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage{

    @Before
    public void setup(){

        ///initialise driver

     BasePage.driver = new ChromeDriver();

    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

        //closing the driver
        if(BasePage.driver!=null){
            BasePage.driver.quit();
        }
    }
}
