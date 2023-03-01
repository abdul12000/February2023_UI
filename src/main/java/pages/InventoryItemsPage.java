package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryItemsPage extends BasePage {
    public InventoryItemsPage(WebDriver driver) {
        super(driver);
    }
///Finding Part
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButtonLocator;
    @FindBy(css = ".shopping_cart_badge") private WebElement shoppingCartLocator;




    ///Doing Part
    public void clickOnAddToCart(){
        addToCartButtonLocator.click();
    }

    public void clickOnShoppingCart(){
        shoppingCartLocator.click();
    }
}
