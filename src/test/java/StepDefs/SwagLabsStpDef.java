package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SwagLabsStpDef extends BaseUtil {
    private BaseUtil base;
    public SwagLabsStpDef(BaseUtil base){
        this.base = base;
    }


    @Given("I am on the swag lab home page {string}")
    public void i_am_on_the_swag_lab_home_page(String url) {
        // Write code here that turns the phrase above into concrete actions

        base.driver.get(url);
    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.enterUserName("standard_user");
        swagLabHomePage.enterPassword("secret_sauce");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.clickOnLoginButton();
    }
    @When("I click on the first item on the Products page")
    public void i_click_on_the_first_item_on_the_products_page() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabProductsPage swagLabProductsPage = new SwagLabProductsPage(base.driver);
        swagLabProductsPage.clickOntheFirstProduct();
    }
    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        InventoryItemsPage inventoryItemsPage = new InventoryItemsPage(base.driver);
        inventoryItemsPage.clickOnAddToCart();
    }
    @When("I click on Shopping cart")
    public void i_click_on_shopping_cart() {
        InventoryItemsPage inventoryItemsPage = new InventoryItemsPage(base.driver);
        inventoryItemsPage.clickOnShoppingCart();
    }
    @When("I click on Checkout")
    public void i_click_on_checkout() {
        // Write code here that turns the phrase above into concrete actions
        YourCartPage yourCartPage = new YourCartPage(base.driver);
        yourCartPage.clickOnCheckoutButton();
    }
    @When("I complete all the required fields")
    public void i_complete_all_the_required_fields() {
        // Write code here that turns the phrase above into concrete actions
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.enterFirstname("Lateef");
        checkoutPage.enterLastname("Adedokun");
        checkoutPage.enterPostCode("Da2 3jh");

    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
        checkoutPage.clickOnContinueButton();
    }
    @When("I click on Finish button")
    public void i_click_on_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        OverviewPage overviewPage = new OverviewPage(base.driver);
        overviewPage.clickOnFinishButton();
    }
    @Then("{string} message is displayed on the order confirmation page")
    public void message_is_displayed_on_the_order_confirmation_page(String msg) {
        // Write code here that turns the phrase above into concrete actions
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(base.driver);
       String actualResult =checkoutCompletePage.getMessage();
       assertThat(actualResult.equalsIgnoreCase(msg), is(true));
    }

}
