package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition2 {


		@Given("^first givenstep here$")
		public void first_givens() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			System.out.println("This is the first step");
			
		   
		}

		@When("^second whenstep here$")
		public void second_whenstep_here() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("This is the second step");
	
		}

		@Then("^Third thenstep here$")
		public void third_thenstep_here() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("This is the third step");
	
		}
		
		@When("^hsfsfs$")
		public void second_whenstep_heresda() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	
		}

}
