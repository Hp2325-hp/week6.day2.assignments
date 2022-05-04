package week6.day2.assignments.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/week6/day2/assignments/features",glue={"week6/day2/assignments/steps","week6/day2/assignments/hooks"},monochrome=true
,publish=true,tags="@snaity")
public class CucumberRunnerHooks extends AbstractTestNGCucumberTests{

}
