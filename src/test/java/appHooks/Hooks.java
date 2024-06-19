package appHooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.util.Properties;

public class Hooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader config;
    Properties prop;
    String browserName;
    String bankUrl;

    @Before(order = 0)
    public void getProperties() {
        config = new ConfigReader();
        prop = config.loadProperties();
        browserName = prop.getProperty("browser");
        bankUrl = prop.getProperty("bankUrl");
    }

    @Before(order = 1)
    public void launchBrowser() {
        driverFactory = new DriverFactory();
        driver = driverFactory.initializeDriver(browserName);
        driver.get(bankUrl);
    }

    @After(order = 0)
    public void closeBrowser() {
        driver.quit();
    }

    @After(order = 1)
    public void failScenarioScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ","_");
            byte[] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
}

