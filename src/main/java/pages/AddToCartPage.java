package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    private WebDriver driver;

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }
    By productName = By.xpath("//*[contains(text(),'Sauce Labs Onesie')]");
    By quantity = By.xpath("//div[@class='cart_quantity']");

    public String getProductQuantity(){
        return driver.findElement(quantity).getText();
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
