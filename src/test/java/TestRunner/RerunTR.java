package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@target/rerun.txt"},
glue="StefDefination",
monochrome=true,
dryRun=false,
plugin= {"html:target/report","json:target/jsonreports.json","rerun:target/rerun.text"})

public class RerunTR {

}
