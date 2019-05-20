package com.project.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {
	//"src/test/resources/features/PanelHeaderScenario.feature",
	"src/test/resources/features/BusinessProcessScenario.feature",

},glue = { "com.project.teststeps" })
public class Runner  {}
