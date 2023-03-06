package StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature_files",
plugin = {"pretty", "html:target/cucumber.html",
        "json:target/cucumber/cucumber-report.json",
        "junit:target/cucumber.xml"},
//tags = "@nop or @NT") //running multiple tags
tags = "@NT")
public class TestRunner {

}
