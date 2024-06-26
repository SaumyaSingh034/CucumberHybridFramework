package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private By userName = By.id("user-name");
    private By passWord = By.id("password");
    private By loginBtn = By.xpath("//input[@id='login-button']");
//    private By forgetpasswordLink = By.xpath("//a[contains(text(),'Forgot login info?')]");
//    private By registerlink = By.xpath("//a[contains(text(),'Register')]");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleOfPage() {
        return driver.getTitle();
    }

//    public boolean clickOnForgetLoginInfo() {
//        return driver.findElement(forgetpasswordLink).isEnabled();
//    }
//    public boolean clickOnRegisterLink(){
//        return driver.findElement(registerlink).isEnabled();
//    }

    public void sendUserName(String username) {
        driver.findElement(userName).sendKeys(username);

    }

    public void sendPassword(String password) {
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickBtn() {
        driver.findElement(loginBtn).click();
    }

    public ProductsPage doLogin(String username, String password){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(loginBtn).click();
        return new ProductsPage(driver);

    }

}
