package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlansPage {
    WebDriver driver;

   
    By productButton = By.xpath("//div[normalize-space()='Packet test plan']"); 

    By productDetails = By.id("product-details");

   
    public PlansPage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void clickFirstProduct() {
        driver.findElement(productButton).click();
    }

   
    public boolean isProductVisible() {
        WebElement element = driver.findElement(productDetails);
        return element.isDisplayed();
    }
}
