package org.webtesting.functional;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OwnerTest {

    @Test
    public void shouldCreateOwner() {
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("http://petclinic.cloudapp.net");

        WebElement link = webDriver.findElement(By.linkText("Find owners"));
        link.click();

        WebElement addOwner = webDriver.findElement(By.linkText("Add Owner"));
        addOwner.click();

        WebElement firstName = webDriver.findElement(By.id("firstName"));
        firstName.sendKeys("My Name");

        WebElement lastName = webDriver.findElement(By.id("lastName"));
        lastName.sendKeys("My Last Name");

        WebElement address = webDriver.findElement(By.id("address"));
        address.sendKeys("My Address");

        WebElement city = webDriver.findElement(By.id("city"));
        city.sendKeys("My City");

        WebElement telephone = webDriver.findElement(By.id("telephone"));
        telephone.sendKeys("123456");

        WebElement submit = webDriver.findElement(By.cssSelector(".form-actions button"));
        submit.click();

        WebElement successfulMessage = webDriver.findElement(By.cssSelector("div.container h2"));

        Assert.assertEquals("The Owner was not created", "Something happened...", successfulMessage.getText());

        webDriver.quit();
    }
}
