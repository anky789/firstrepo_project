package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demo_step_page {
WebDriver driver;
    public demo_step_page(WebDriver ldriver)
    {
this.driver=ldriver;
    }
//    By user_name= By.id("username");
//    By pass_word= By.id("password");
//    By login_button=By.xpath("\"//i[@class=\\\"fa fa-2x fa-sign-in\\\"]\"))");
    // *page factory model*
    @FindBy(id="username")
    WebElement user_name;
    @FindBy(id="password")
    WebElement pass_word;
    @FindBy(xpath = "\\\"//i[@class=\\\\\\\"fa fa-2x fa-sign-in\\\\\\\"]\\\"))")
    WebElement login_button;




    public void enter_username(String strn){
       // driver.findElement(user_name).sendKeys("strn");
user_name.sendKeys();
    }
public void enter_password(String pass){
       // driver.findElement(pass_word).sendKeys("Pass");
pass_word.sendKeys();
}
public void login_button()
{
   // driver.findElement((login_button)).click();
login_button.click();

}


}
