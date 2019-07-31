package sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/sample/scnrio4.feature",

//glue="sample")

tags= {"@login or @regression"},
plugin="html:target\\htmlreport")

//plugin="json:target\\Jsonreport.json")

//plugin="junit:target\\xmlreport.xml")


public class Runnerclass {

}
