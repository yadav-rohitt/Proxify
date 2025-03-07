package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;

    // Locators
    By usernameField = By.xpath("//input[@id='username']");
    By emailField = By.xpath("//input[@id='email']");
    By passwordField = By.xpath("//input[@id='password']");
    By signupButton = By.xpath("(//button[@type='submit'])[1]");
    

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }

    
}

