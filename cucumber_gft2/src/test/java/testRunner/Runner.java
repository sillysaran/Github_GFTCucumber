package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="Feature\\tagsDemo.feature",glue= {"stepdef"},plugin= {"pretty","html:target/cucumber.html"},tags= {"@SmokeTest, @RegressionTest,~0@End2End"})
public class Runner {

}
