package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests_CH3_Task {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        // TODO: 1. Go to https://the-internet.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com/");

        // TODO: 2. Click on "Shifting content" link
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        // TODO: 3. Click on "Example 1: Menu Element" link
        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        // TODO: 4. Print how many "Menu" elements have appeared
        List<WebElement> menuItems = driver.findElements(By.tagName("li")); //By.xpath("//*/li")
        System.out.println("Number of Menu items - " + menuItems.size());

        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests_CH3_Task test = new BaseTests_CH3_Task();
        test.setUp();


    }
}
