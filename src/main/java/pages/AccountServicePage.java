package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountServicePage {

    private WebDriver driver;
    private By accountService = By.cssSelector("div#leftPanel ul li");
    private By dashboardService = By.xpath("//div[@id='headerPanel']/ul[1]/li");
    private By footerPanelService = By.xpath("//div[@id='footerPanel']/ul[1]/li");

    public AccountServicePage(WebDriver driver){
        this.driver = driver;
    }
    public int getCountAccountService(){
        return driver.findElements(accountService).size();
    }

    public List<String> validateAccountService(){
        List<String> data = new ArrayList<>();
        List<WebElement> accountsData = driver.findElements(accountService);
        for(WebElement e : accountsData){
            String text = e.getText();
            System.out.println(text);
            data.add(text);
        }
        return data;
    }
}
