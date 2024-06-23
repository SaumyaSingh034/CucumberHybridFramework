package stepDefs;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountServicePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class AccountServiceStepDef {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountServicePage asp;


    @Given("user will login to the bank portal using below credentials")
    public void userWillLoginToTheBankPortalUsingBelowCredentials(DataTable datatable) {
        List<Map<String, String>> credentials = datatable.asMaps();
        String username = credentials.get(0).get("userName");
        String pwd = credentials.get(0).get("password");
        asp = loginPage.doLogin(username,pwd);
    }

    @Given("user is on the Account Section Page")
    public void userIsOnTheAccountSectionPage() {
        System.out.println("URL OF THE PAGE : "+DriverFactory.getDriver().getCurrentUrl());
    }

    @Then("user gets the Account Services")
    public void userGetsTheAccountServices(DataTable dataTable) {
        List<String> expectedList = dataTable.asList();
        List<String> actualList = asp.validateAccountService();
        Assert.assertTrue("List is not as expected : "+expectedList, expectedList.equals(actualList));
    }

    @And("user gets the count of Account Services as {int}")
    public void userGetsTheCountOfAccountServicesAs(int expected) {
        Assert.assertTrue("The count is not as expected : "+expected, asp.getCountAccountService() == expected);
    }
}
