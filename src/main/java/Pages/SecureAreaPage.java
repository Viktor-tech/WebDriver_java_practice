package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By statussAlert = By.id("flash");

    // By.cssSelector("#flash");
    // By.xpath ("//*[@id='flash']");
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText() {
       return driver.findElement(statussAlert).getText();

    }
}
