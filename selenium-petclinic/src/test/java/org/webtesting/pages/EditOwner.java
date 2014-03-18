package org.webtesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditOwner {
    private final WebDriver webDriver;

    public EditOwner(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillLastName(String lastName) {
        this.webDriver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    public void fillAddress(String address) {
        this.webDriver.findElement(By.id("address")).sendKeys(address);
    }

    public void fillCity(String city) {
        this.webDriver.findElement(By.id("city")).sendKeys(city);
    }

    public void fillTelephone(String telephone) {
        this.webDriver.findElement(By.id("telephone")).sendKeys(telephone);
    }

    public void submit() {
        webDriver.findElement(By.cssSelector(".form-actions button")).submit();
    }

    public String title() {
        return webDriver.findElement(By.cssSelector("div.container h2")).getText();
    }


    public String formErrors() {
        return webDriver.findElement(By.cssSelector(".error span")).getText();
    }
}
