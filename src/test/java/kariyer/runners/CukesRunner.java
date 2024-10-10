package kariyer.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "kariyer/step_definitions",
        dryRun=false,
        tags = ""
)
public class CukesRunner {
}
