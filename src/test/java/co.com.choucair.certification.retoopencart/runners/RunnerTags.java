package co.com.choucair.certification.retoopencart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src\\test\\resources\\features\\filtroOpencart.feature",
        tags = "@stories",
        glue ="co.com.choucair.certification.retoopencart.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
