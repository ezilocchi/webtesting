package org.webtesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by emiliano on 3/18/14.
 */
public class Menu {
    private final WebDriver webDriver;

    public Menu(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnFindOwners() {
        webDriver.findElement(By.linkText("Find owners")).click();
    }
}
