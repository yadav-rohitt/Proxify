package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.PlansPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlansTest {
    WebDriver driver;
    PlansPage plansPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proxify.gg/plans");
        plansPage = new PlansPage(driver);
    }

    @Test
    public void testClickProductAndVerifyVisibility() {
        plansPage.clickFirstProduct();
        Assert.assertTrue(plansPage.isProductVisible(), "Product details should be visible after clicking.");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
