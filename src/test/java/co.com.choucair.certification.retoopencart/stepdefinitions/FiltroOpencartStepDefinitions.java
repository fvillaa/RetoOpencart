package co.com.choucair.certification.retoopencart.stepdefinitions;

import co.com.choucair.certification.retoopencart.model.DataOpencart;
import co.com.choucair.certification.retoopencart.tasks.OpenUp;
import co.com.choucair.certification.retoopencart.tasks.FiltroProductReturns;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class FiltroOpencartStepDefinitions {
@Before
public void setStage() {OnStage.setTheStage(new OnlineCast()); }

    @Given("^User of the Opencart page$")
    public void userOfTheOpencartPage() {
    OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage());}


    @When("^Consult the information of the product return department$")
    public void consultTheInformationOfTheProductReturnDepartment(List<DataOpencart> dataOpencart) {
        OnStage.theActorInTheSpotlight().attemptsTo(FiltroProductReturns.the(dataOpencart.get(0)));
    }

    @Then("^Know the list of existing products in return$")
    public void knowTheListOfExistingProductsInReturn() {

    }
}
