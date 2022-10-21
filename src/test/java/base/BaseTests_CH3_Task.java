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
        driver.get("https://the-internet.herokuapp.com/");

        //1. Click on "Shifting content"
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        //2. Click on "Example 1: Menu Element"
        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        //3. Print how many menu elements have appeared
        List<WebElement> links = driver.findElements(By.xpath("*//div/ul/li/a"));
        System.out.println(links.size());

        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests_CH3_Task test = new BaseTests_CH3_Task();
        test.setUp();


    }
}
