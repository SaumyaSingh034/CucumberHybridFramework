package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

    private WebDriver driver;
    private By productsList = By.xpath("//div[@class='inventory_item_description']");
    private By addToCart = By.xpath("//*[contains(text(),'Add to cart')]");

    private By priceList = By.xpath("//div[@class='inventory_item_price']");
    private By sort = By.xpath("//select[@class='product_sort_container']");

    private By menuBtn = By.cssSelector("button#react-burger-menu-btn");
    private By cart = By.cssSelector("a.shopping_cart_link");

}
