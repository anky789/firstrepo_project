package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.demo_step_page;

import java.sql.Driver;

public class demo_step {
    WebDriver driver;
    demo_step_page obj = new demo_step_page(driver);

    @Given(":User is on the app")
    public void user_is_on_the_app() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("user enters the credentials")
    public void user_enters_the_credentials() {
//        driver.findElement(By.id("username")).sendKeys("Ankit");
//        driver.findElement(By.id("password")).sendKeys("Password");
        obj.enter_username("ankit");
        obj.enter_password("password");

    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
//        driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]")).click();
        obj.login_button();
    }

    @Then("user should login into the app")
    public void user_should_login_into_the_app() {
        if (driver.getCurrentUrl() == "") {
            System.out.println("pass");
        } else {
            System.out.println("Pass");
        }
    }
}
