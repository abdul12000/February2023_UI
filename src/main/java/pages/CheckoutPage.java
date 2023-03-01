package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
///Finding Part
    @FindBy(id = "first-name")
    private WebElement firstnameLocator;
    @FindBy(id = "last-name")
    private WebElement lastnameLocator;
    @FindBy(id = "postal-code")
    private WebElement postalCodeLocator;
    @FindBy(id = "continue")
    private WebElement continueLocator;


    ///Doing Part
    public void enterFirstname(String fName){
        firstnameLocator.sendKeys(fName);
    }
    public void enterLastname(String lName){
        lastnameLocator.sendKeys(lName);
    }
    public void enterPostCode(String pCode){
        postalCodeLocator.sendKeys(pCode);
    }

    public void clickOnContinueButton(){
        continueLocator.click();
    }
}
