package org.webtesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by emiliano on 3/18/14.
 */
public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void go() {
        webDriver.get("http://localhost:9966/petclinic");
    }
}
