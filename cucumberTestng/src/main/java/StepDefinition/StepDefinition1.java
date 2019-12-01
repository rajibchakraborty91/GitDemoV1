package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 {


		@Given("^first givenstep here2nd$")
		public void first_givens() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			System.out.println("This is the first step 2nd case");
			
		   
		}

		@When("^second whenstep here2nd$")
		public void second_whenstep_here() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("This is the second step 2nd case");
	
		}

		@Then("^Third thenstep here2nd$")
		public void third_thenstep_here() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("This is the third step 2nd case");
	
		}
	

}
