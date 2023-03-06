package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.PropertyReader;

import java.io.IOException;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SwagLabsStpDef extends BaseUtil {
    private BaseUtil base;
    private  SwagLabHomePage swagLabHomePage;
    SwagLabProductsPage swagLabProductsPage;
    InventoryItemsPage inventoryItemsPage;
    YourCartPage yourCartPage;
    public SwagLabsStpDef(BaseUtil base){
        this.base = base;
    }

    public void initPages(){
        swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabProductsPage = new SwagLabProductsPage(base.driver);
        inventoryItemsPage = new InventoryItemsPage(base.driver);
        yourCartPage = new YourCartPage(base.driver);
    }

    @Given("I am on the swag lab home page {string}")
    public void i_am_on_the_swag_lab_home_page(String url) {
        // Write code here that turns the phrase above into concrete actions

        base.driver.get(url);
    }

    @Given("I am on the swag lab home page")
    public void iAmOnTheSwagLabHomePage() throws IOException {
        base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        PropertyReader propertyReader = new PropertyReader();
        base.driver.get(propertyReader.getSwagLabUrl());
    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        initPages();
        swagLabHomePage.enterUserName("standard_user");
        swagLabHomePage.enterPassword("secret_sauce");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage swagLabHomePage = new SwagLabHomePage(base.driver);
        swagLabHomePage.clickOnLoginButton();

//        WebElement pWord = driver.findElement(By.cssSelector("input[id='password']"));
//        pWord.sendKeys(Keys.TAB);
//
//        WebElement loginButton = driver.findElement(By.cssSelector("input[id='login-button']"));
//        loginButton.sendKeys(Keys.ENTER);
    }
    @When("I click on the first item on the Products page")
    public void i_click_on_the_first_item_on_the_products_page() {
        // Write code here that turns the phrase above into concrete actions

        swagLabProductsPage.clickOntheFirstProduct();
    }
    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions

        inventoryItemsPage.clickOnAddToCart();
    }
    @When("I click on Shopping cart")
    public void i_click_on_shopping_cart() {

        inventoryItemsPage.clickOnShoppingCart();
    }
    @When("I click on Checkout")
    public void i_click_on_checkout() {
        // Write code here that turns the phrase above into concrete actions

        yourCartPage.clickOnCheckoutButton();
    }
    @When("I complete all the required fields")
    public void i_complete_all_the_required_fields() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        CheckoutPage checkoutPage = new CheckoutPage(base.driver);
//        checkoutPage.enterFirstname("Lateef");
//        checkoutPage.enterLastname("Adedokun");
//        checkoutPage.enterPostCode("Da2 3jh");
        PropertyReader propertyReader = new PropertyReader();
        checkoutPage.enterFirstname(propertyReader.getFirstName());
        checkoutPage.enterLastname(propertyReader.getLastname());
        checkoutPage.enterPostCode(propertyReader.getPostCode());

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

    @And("I enter details for only firstname and lastname")
    public void iEnterDetailsForOnlyFirstnameAndLastname() {
        
    }

    @Then("error msg {string} is displayed")
    public void errorMsgIsDisplayed(String msg) {
        if (msg=="Error: Postal Code is required"){

        }
        else if (msg=="Error: First Name is required"){

        }
        else if(msg == "Error: Last Name is required"){

        }


    }

    @And("I enter details for only lastname and postcode")
    public void iEnterDetailsForOnlyLastnameAndPostcode() {

    }

    @And("I enter details for only firstname and postcode")
    public void iEnterDetailsForOnlyFirstnameAndPostcode() {
    }


}
