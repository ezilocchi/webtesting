package org.webtesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindOwners {

    private final WebDriver webDriver;

    public FindOwners(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnAddOwner() {
        this.webDriver.findElement(By.linkText("Add Owner")).click();
    }
}
