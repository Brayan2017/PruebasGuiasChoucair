package proyectobase2.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyectobase2.model.AcademyChoucairData;
import proyectobase2.questions.Answer;
import proyectobase2.tasks.Login;
import proyectobase2.tasks.OpenUp;
import proyectobase2.tasks.Search;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brayan want to learn automation at the Academy Choucair$")
    public void thanBrayanWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorCalled("brayan").wasAbleTo(OpenUp.thePage(),
                (Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course on the choucair academy plaform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlaform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
