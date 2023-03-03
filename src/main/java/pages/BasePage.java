package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriverWait wait;
    public  BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitForElementToBeClickable(WebElement ele){
        wait.until(ExpectedConditions.elementToBeClickable(ele));

    }
    public void waitForElementToBeVisible(WebElement ele){
        wait.until(ExpectedConditions.visibilityOf(ele));

    }
}
