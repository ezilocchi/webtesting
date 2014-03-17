package org.codelearning.pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.linkText;

public class Menu extends FluentWebDriverPage{

    public Menu(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickOnFindOwner() {
       link(linkText("Find owners")).click();
    }
}