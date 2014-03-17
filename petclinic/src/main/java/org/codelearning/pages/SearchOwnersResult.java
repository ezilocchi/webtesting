package org.codelearning.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class SearchOwnersResult extends FluentWebDriverPage {

    public SearchOwnersResult(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public Integer ownersCount() {
        List<WebElement> owners = findElements(cssSelector("table#owners tbody tr"));
        return owners.size();
    }
}
