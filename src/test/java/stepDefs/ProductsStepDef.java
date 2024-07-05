package stepDefs;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountServicePage;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductsStepDef {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private ProductsPage pg;
    int countProductList;
    List<String> expectedList = new ArrayList<>();



    @Given("user will login to the Swag Labs Login Page using below credentials")
    public void userWillLoginToTheSwagLabsLoginPageUsingBelowCredentials(DataTable datatable) {
        List<Map<String, String>> credentials = datatable.asMaps();
        String username = credentials.get(0).get("userName");
        String pwd = credentials.get(0).get("password");
        pg = loginPage.doLogin(username,pwd);
    }

    @Given("user is on the Products page")
    public void userIsOnTheProductsPage() {
        System.out.println("URL OF THE PAGE : "+DriverFactory.getDriver().getCurrentUrl());
    }

    @When("user gets the count of all the products")
    public void userGetsTheCountOfAllTheProducts() {
        countProductList = pg.countOfProductsList();
        System.out.println("Number of Product List : "+countProductList);
    }

    @When("user gets the list of all products")
    public void userGetsTheListOfAllProducts() {
    expectedList = pg.productListData();
    }

    @Then("product list should contain")
    public void productListShouldContain(DataTable dataTable) {
        List<String> actualList = dataTable.asList();
        Assert.assertTrue("List is not same : ", actualList.equals(expectedList));

    }

    @Then("the count of products should be {int}")
    public void theCountOfProductsShouldBe(int expectedCount) {
        Assert.assertTrue("Product List Count is not same", expectedCount == countProductList);

    }

    @And("user click on {string} product")
    public void userClickOnProduct(String product) {
        pg.clickOnSpecificProduct(product);
    }

    @And("user click on Add to cart button")
    public void userClickOnAddToCartButton() {
        pg.addToCart();

    }

    @Then("user verify the product should be available to cart")
    public void userVerifyTheProductShouldBeAvailableToCart() {
    }

    @When("user click the Menu btn")
    public void userClickTheMenuBtn() {

    }

    @And("user gets the list of menu items")
    public void userGetsTheListOfMenuItems() {

    }

    @Then("count of menu items should be {int}")
    public void countOfMenuItemsShouldBe(int arg0) {

    }

    @And("menu product list should be")
    public void menuProductListShouldBe() {

    }
}
