package kariyer.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-repeat.xml",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.repor.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "java/kariyer/step_definition",
        dryRun=true,
        tags = "",
        publish = true
)
public class CukesRunner {
}
