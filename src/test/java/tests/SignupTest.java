package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupTest {
    WebDriver driver;
    SignupPage signupPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proxify.gg/signup");
        signupPage = new SignupPage(driver);
    }

    @Test(priority = 1)
    public void testValidSignup() {
        signupPage.enterUsername("rohit12");
        signupPage.enterEmail("rohyadav18@gmail.com");
        signupPage.enterPassword("StrongPass123!");
        signupPage.clickSignup();
      
    }

    @Test(priority = 2)
    public void testSignupWithMismatchedPasswords() {
        signupPage.enterUsername("user123");
        signupPage.enterEmail("user123@example.com");
        signupPage.enterPassword("password123");
        signupPage.clickSignup();
        Assert.assertTrue(driver.getPageSource().contains("Passwords do not match."));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
