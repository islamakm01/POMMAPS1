package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BaseClass {

    public static WebDriver driver;
    public static Wait<WebDriver> wait;
    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }

    public static WebElement getElementById(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }
    public static WebElement getElementByName(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
    }
    public static WebElement getElementByXpath(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public static WebElement getElementByCss(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }
    public static WebElement getElementByClassName(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }
}
