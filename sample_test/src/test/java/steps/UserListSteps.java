package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page_objects.BasePage;
import page_objects.CreateUserPage;
import page_objects.HomePage;
import page_objects.UserListPage;
import utils.DriverManager;

public class UserListSteps{

    String appURL = "https://school-demo-web-app.azurewebsites.net/";
    WebDriver driver = new DriverManager().open();

    HomePage homePage = new HomePage(driver);
    UserListPage userListPage = new UserListPage(driver);
    CreateUserPage createUserPage = new CreateUserPage(driver);


    @Given("the application is {string}")
    public void theApplicationIs(String app) {

        driver.manage().window().maximize();
        BasePage page = new BasePage(driver);
        if(app.equals("SchoolManagementApp")){
            driver.get(appURL);
        }

    }

    @Given("user is on user list page")
    public void userIsOnUserListPage() {

        homePage.clickUsers();
    }

    @When("user clicks on the create user button")
    public void userClicksOnTheCreateUserButton() {

        userListPage.clickCreateUsers();
    }

    @Then("user is navigated to create user page")
    public void userIsNavigatedToCreateUserPage() {

        String pageHeader = createUserPage.getPageHeader();
        Assert.assertEquals(pageHeader, "Create user");
    }

    @When("user fills relevant details in the create user form with {string}, {string}, {string}, {string}, {string}")
    public void userFillsRelevantDetailsInTheCreateUserFormWith(String fname, String lname, String schoolName, String usrTyp, String yrGrp) {

        createUserPage.enterFirstName(fname);
        createUserPage.enterLastName(lname);
        createUserPage.selectSchool(schoolName);
        createUserPage.selectUserType(usrTyp);
        createUserPage.selectYearGroup(yrGrp);
    }

    @And("clicks Save button")
    public void clicksSaveButton() {

        createUserPage.clickSave();
    }

    @Then("user should be saved and displayed in the user list")
    public void userShouldBeSavedAndDisplayedInTheUserList() {
    }


}
