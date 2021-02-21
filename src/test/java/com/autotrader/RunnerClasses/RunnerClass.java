package com.autotrader.RunnerClasses;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features/AutoTrader.feature",
        glue = "src/test/java/com/autotrader/StepDefinitions",
        dryRun = false,
        tags = "@smoke_test"

)
public class RunnerClass {
}










