package org.webtesting.functional;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webtesting.pages.EditOwner;
import org.webtesting.pages.FindOwners;
import org.webtesting.pages.HomePage;
import org.webtesting.pages.Menu;

public class OwnerTest {

    @Test
    public void shouldCreateOwner() {
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("http://localhost:9966/petclinic");
        //webDriver.get("http://petclinic.cloudapp.net");

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

        WebElement title = webDriver.findElement(By.cssSelector("div.container h2"));

        Assert.assertEquals("Owner Information", title.getText());

        webDriver.quit();
    }

    @Test
    public void shouldNotCreateOwnerByPhoneNumberValidation() {
        WebDriver webDriver = new FirefoxDriver();

        //webDriver.get("http://petclinic.cloudapp.net");
        webDriver.get("http://localhost:9966/petclinic");

        WebElement link = webDriver.findElement(By.linkText("Find owners"));
        link.click();

        WebElement addOwner = webDriver.findElement(By.linkText("Add Owner"));
        addOwner.click();

        //Formulario
        WebElement firstName = webDriver.findElement(By.id("firstName"));
        firstName.sendKeys("My Name");

        WebElement lastName = webDriver.findElement(By.id("lastName"));
        lastName.sendKeys("My Last Name");

        WebElement address = webDriver.findElement(By.id("address"));
        address.sendKeys("My Address");

        WebElement city = webDriver.findElement(By.id("city"));
        city.sendKeys("My City");

        WebElement telephone = webDriver.findElement(By.id("telephone"));
        telephone.sendKeys("abc");

        WebElement submit = webDriver.findElement(By.cssSelector(".form-actions button"));
        submit.click();

        WebElement title = webDriver.findElement(By.cssSelector("div.container h2"));

        Assert.assertEquals("New Owner", title.getText());

        WebElement errorMessage = webDriver.findElement(By.cssSelector(".error span"));

        Assert.assertEquals("numeric value out of bounds (<10 digits>.<0 digits> expected)", errorMessage.getText());

        webDriver.quit();
    }

    
}
