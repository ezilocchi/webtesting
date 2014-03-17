package org.codelearning.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import static org.openqa.selenium.By.cssSelector;

public class SearchOwners extends FluentWebDriverPage {

    public SearchOwners(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void findOwners() {
        findElement(cssSelector(".form-actions button")).click();
    }

}
