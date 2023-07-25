package uk.co.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/featurefile/JobSearchTest.feature",
                 glue = "uk/co/library",
                  tags = "@smoke",

                  plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class JobSearchRunner {



}
