package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "stepDefinitions", dryRun = false, 
tags = "@testThis")
public class TestRunner {

}
