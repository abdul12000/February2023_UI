package StepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NopcommerceStepdef extends BaseUtil {
    private BaseUtil base;
    public NopcommerceStepdef(BaseUtil base){
        this.base =base;
    }


    @Given("I am on the nopcommerce website {string}")
    public void i_am_on_the_nopcommerce_website(String string) {
        // Write code here that turns the phrase above into concrete actions
     base.driver.get(string);
    }

    @When("I navigate to the Desktop page via")
    @When("I navigate to the Desktop page via mouse hoover")
    public void i_navigate_to_the_desktop_page_via_mouse_hoover() {
        List<WebElement> ComputersMenu = base.driver.findElements(By.xpath("//a[contains(text(),'Computers')]"));

        new Actions(base.driver)
                .moveToElement(ComputersMenu.get(0))
                .perform();


        List<WebElement> DesktopSubMenu = base.driver.findElements(By.linkText("Desktops"));
DesktopSubMenu.get(0).click();

    }
    @Then("Desktop page is disapled")
    public void desktop_page_is_disapled() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        System.out.println("hello am done");
    }


}
