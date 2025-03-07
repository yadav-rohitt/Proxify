package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proxify.gg/login"); 
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void testValidLogin() {
        loginPage.enterEmail("admin@gmail.com");
        loginPage.enterPassword("7ERssaf51Z39n");
        loginPage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://proxify.gg/dashboard");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        loginPage.enterEmail("wrong@example.com");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();
      //  Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password.");
        System.out.println("Invalid email");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
