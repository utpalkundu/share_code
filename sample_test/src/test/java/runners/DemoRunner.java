package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/"},
        plugin = {"pretty", "html:target/cucumber.html"},
        tags = "@testDemo",
        glue = {"steps"}
)

public class DemoRunner{

}



