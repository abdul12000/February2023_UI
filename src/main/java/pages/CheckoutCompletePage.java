package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
///Finding Part
    @FindBy(css = ".complete-header")
    private WebElement thankYouMessage;


    ///Doing Part

    public String getMessage(){
        return thankYouMessage.getText();
    }
}
