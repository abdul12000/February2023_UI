package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
///Finding Part
    @FindBy(id = "finish")
    private WebElement finishButtonLocator;


    ///Doing Part

    public void clickOnFinishButton(){
        finishButtonLocator.click();
    }
}
