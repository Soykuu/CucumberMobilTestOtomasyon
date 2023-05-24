package testRunners;

import io.appium.java_client.AppiumDriver;
import utilities.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/features"},
        glue = {"stepDefinitions","utilities","pages"},
        tags= " ",
        plugin = {"summary","pretty","html:Reports/CucumberReport/Reports.html"}
)

public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver;

    public Runner() {
        driver = DriverFactory.getDriver();
    }
}

