import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by daiyun on 2019/11/18
 */
public class MyStepdefs {
    @Given("^I am on the \"([^\"]*)\" page$")
    public Boolean  iAmOnThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        return  true;
    }

    @And("^I click the \"([^\"]*)\" button$")
    public Boolean iClickTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        return  true;
    }

    @Then("^I should go to the \"([^\"]*)\" page$")
    public Boolean iShouldGoToThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        return  true;
    }
}
