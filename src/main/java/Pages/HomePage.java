package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthLink = By.linkText("Form Authentication"); // By.xpath("//*[@href='/login']")

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuth(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }
}
