package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //dryRun = true,
        //tags = "@completePurchase",
        features = "src/test/resources/features",
        glue = "stepdefinitions"
)
public class TestSaucedemoRunner {
}
