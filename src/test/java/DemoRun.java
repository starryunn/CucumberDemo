import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by daiyun on 2019/11/18
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"})
public class DemoRun {
}
