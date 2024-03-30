package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber_html_report"}, 
		features="src/test/java/features",
		glue="stepDefinations"
		)
public class Runner {
    
}










		
