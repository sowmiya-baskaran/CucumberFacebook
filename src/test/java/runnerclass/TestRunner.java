package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepdefinition","hooks"} ,
    plugin= {"html:target\\index.html","json:target\\index1.json"},
    monochrome = true,
    		// dryRun=true,
    tags="@scenario1 or @map"
   
)
/*
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",
	glue={"stepdefinition","hooks"},
	dryRun=false,
	monochrome=true,
	plugin= {"html:target\\report.html","json:target\\jsonreport.json"},
	tags="@map"
	
 
		)*/
public class TestRunner {

}

