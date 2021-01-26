package fileRunning;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class FileRunner {
	 	
		@Given("^Visiting the webpage \"([^\"]*)\"$")
	    public void visiting_the_webpage_something(String strArg1) throws Throwable {
			System.out.println("Visiting the webpage");
			System.out.println("Webpage " + strArg1);
	        
	    }

	    @When("^Using credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void using_credentials_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("Username " + strArg1);
	    	System.out.println("Password " + strArg2);
	    }

	    @Then("^The text shlould be available \"([^\"]*)\"$")
	    public void the_text_shlould_be_available_something(String strArg1) throws Throwable {
	    	System.out.println("Text ");
	    }

	    @And("^The login is success \"([^\"]*)\"$")
	    public void the_login_is_success_something(String strArg1) throws Throwable {
	    	System.out.println("Login is " + strArg1);
	    }

	
	

}
