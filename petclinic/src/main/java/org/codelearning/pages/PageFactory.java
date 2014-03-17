package org.codelearning.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageFactory {

    private final WebDriverProvider webDriverProvider;

    public PageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    public Home newHome() {
        return new Home(webDriverProvider);
    }

    public SearchOwners newSearchOwners() {
        return new SearchOwners(webDriverProvider);
    }

    public Menu newMenu() {
        return new Menu(webDriverProvider);
    }

    public SearchOwnersResult newSearchOwnersResults() {
        return new SearchOwnersResult(webDriverProvider);
    }
}
