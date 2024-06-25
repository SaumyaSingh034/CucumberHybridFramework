package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

    private WebDriver driver;
    private By productsList = By.xpath("//div[@class='inventory_item_description']");
    private By addToCart = By.xpath("//*[contains(text(),'Add to cart')]");
}
