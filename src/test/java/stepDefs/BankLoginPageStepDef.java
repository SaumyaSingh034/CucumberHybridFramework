package stepDefs;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class BankLoginPageStepDef {

    private LoginPage loginPageOR = new LoginPage(DriverFactory.getDriver());
    private String actualTitle;
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("URL OF THE PAGE : "+DriverFactory.getDriver().getCurrentUrl());
    }

    @When("user gets the title of the page")
    public void userGetsTheTitleOfThePage() {
        actualTitle = loginPageOR.getTitleOfPage();
    }

    @When("user enters username as {string}")
    public void userEntersUsernameAs(String username) {
        loginPageOR.sendUserName(username);
    }

    @And("user enters password as {string}")
    public void userEntersPasswordAs(String password) {
        loginPageOR.sendPassword(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPageOR.clickBtn();
    }

    @Then("title of page should be {string}")
    public void titleOfPageShouldBe(String expectedTitle) {
        Assert.assertTrue("Title of the Page is not same",expectedTitle.equalsIgnoreCase(actualTitle));
    }


    @Then("Forgot login info? link should be displayed")
    public void forgotLoginInfoLinkShouldBeDisplayed() {
        Assert.assertTrue("Forget Login Info Link is not enabled/Displayed", loginPageOR.clickOnForgetLoginInfo());
    }

    @Then("Register link should be displayed")
    public void registerLinkShouldBeDisplayed() {
        Assert.assertTrue("Register Link is not enabled/Displayed", loginPageOR.clickOnRegisterLink());
    }
}
