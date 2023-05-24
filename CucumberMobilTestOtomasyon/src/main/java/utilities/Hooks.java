package utilities;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*;
import org.testng.Reporter;


import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void before(){
        //String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver("Android");
    }

    @After
    public void after() {
        if (this.driver != null) {
            this.driver.quit();
    }
}
}
