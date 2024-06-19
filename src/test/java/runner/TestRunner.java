package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/resources/feature"},
        glue = {"stepDefs","appHooks"},
        plugin = {"pretty"}

)

public class TestRunner {


}
