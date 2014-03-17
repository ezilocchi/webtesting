package org.codelearning.steps;

import org.jbehave.core.annotations.Given;

import org.codelearning.pages.Home;
import org.codelearning.pages.PageFactory;

public class PetClinicDotComSteps {
    
    private Home home;

    public PetClinicDotComSteps(PageFactory pageFactory){
        home = pageFactory.newHome();
    }

    @Given("I am on the home page")
    public void homepage() {
        home.go();
    }
}
