package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.EncapsulationClass;
import utilities.Utility;

public class NewtoursRegisterationStepdef extends BaseUtil {
    private BaseUtil base;
    EncapsulationClass encapsulationClass;
    public NewtoursRegisterationStepdef(BaseUtil base){
        this.base =base;
    }

    @Given("I am on the Newtours website {string}")
    public void i_am_on_the_newtours_website(String string) {
        // Write code here that turns the phrase above into concrete actions
        base.driver.get(string);
    }
    @When("I click on the register link")
    public void i_click_on_the_register_link() {
        // Write code here that turns the phrase above into concrete actions
//        base.driver.findElement(By.linkText("REGISTER")).click();
        base.driver.findElement(By.linkText("REGISTER")).sendKeys(Keys.ENTER);

//        EncapsulationClass encapsulationClass = new EncapsulationClass();
        encapsulationClass = new EncapsulationClass();
        encapsulationClass.setRandNumbers(Utility.generateRandomNumbers());
//        encapsulationClass.setRandNumbers(1234);
    }
    @When("I enter Username, pword and confPWord as {string}, {string} and {string}")
    public void i_enter_username_pword_and_conf_p_word_as_and(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
     base.driver.findElement(By.id("email")).sendKeys(string);
        base.driver.findElement(By.name("password")).sendKeys(string2);
        base.driver.findElement(By.name("confirmPassword")).sendKeys(string3);



    }
    @When("I press enter on the Submit button")
    public void i_press_enter_on_the_submit_button() {
     base.driver.findElement(By.cssSelector("input[name='submit']")).sendKeys(Keys.ENTER);
    }
    @Then("account is created")
    public void account_is_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello");

    }

    @And("I enter random email into the email addres field")
    public void iEnterRandomEmailIntoTheEmailAddresField() throws InterruptedException {
//        EncapsulationClass encapsulationClass = new EncapsulationClass();
        WebElement usernameLocator = base.driver.findElement(By.id("userName"));
        System.out.println(encapsulationClass.getRandNumbers());
        usernameLocator.sendKeys(encapsulationClass.getRandNumbers()+ "ksksk@yahoo.com");
        Thread.sleep(5000);




    }
}
