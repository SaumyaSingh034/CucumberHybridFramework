package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage {

    private WebDriver driver;
    private By productsList = By.xpath("//div[@class='inventory_item_description']");
    private By addToCart = By.xpath("//*[contains(text(),'Add to cart')]");

    private By addToCartToSpecificItem = By.xpath("//div[@class='inventory_item_description']/div[2]/button");

    private By priceList = By.xpath("//div[@class='inventory_item_price']");
    private By sort = By.xpath("//select[@class='product_sort_container']");

    private By menuBtn = By.cssSelector("button#react-burger-menu-btn");
    private By cart = By.cssSelector("a.shopping_cart_link");

    private By menuList = By.cssSelector("a.bm-item.menu-item");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public int countOfProductsList(){
        return driver.findElements(productsList).size();
    }

    public List<String> productListData(){
        List<WebElement> prodList = driver.findElements(productsList);
        List<String> actualData = new ArrayList<>();
        for(WebElement e : prodList){
            String data = e.getText();
            System.out.println(data);
            actualData.add(data);
        }
        return actualData;
    }

    public void clickOnSpecificProduct( String productName){
        for(WebElement e : driver.findElements(productsList)){
            if(productName.equalsIgnoreCase(e.getText())){
                e.findElement(addToCartToSpecificItem).click();
            }
        }
    }

}
