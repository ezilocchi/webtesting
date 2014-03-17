package org.codelearning.steps;

import org.codelearning.pages.Menu;
import org.codelearning.pages.PageFactory;
import org.codelearning.pages.SearchOwners;
import org.codelearning.pages.SearchOwnersResult;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.Matchers.equalTo;

public class OwnerSteps {

    private Menu menu;
    private SearchOwners searchOwner;
    private SearchOwnersResult searchOwnerResults;

    public OwnerSteps(PageFactory pageFactory) {
        this.menu = pageFactory.newMenu();
        this.searchOwner = pageFactory.newSearchOwners();
        this.searchOwnerResults = pageFactory.newSearchOwnersResults();
    }

    @When("I search for owners without filtering")
    public void findOwnerMenuEntry() {
        menu.clickOnFindOwner();
        searchOwner.findOwners();
    }

    @Then("I should see a list of $numberOfOwners owners")
    public void ownersTableIsPresent(Integer numberOfOwners) {
        MatcherAssert.assertThat(searchOwnerResults.ownersCount(), equalTo(numberOfOwners));
    }
}
