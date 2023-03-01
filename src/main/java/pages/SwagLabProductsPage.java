package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwagLabProductsPage extends BasePage {
    public SwagLabProductsPage(WebDriver driver) {
        super(driver);
    }
///Finding Part
//    @FindBy(css = "div[class='inventory_item_name']")
    @FindBy(css = "div.inventory_item_name")
    private List<WebElement> productsLocators;




    ///Doing Part

    public void clickOntheFirstProduct(){
        productsLocators.get(0).click();
    }
}
