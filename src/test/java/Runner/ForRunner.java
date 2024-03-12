package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	
	features = {"C:\\Users\\Prashanthi\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\CucumberJava\\src\\test\\resources\\Forms\\forn.feature"},
	
	glue = {"steps"}
	
)

public class ForRunner {

}
