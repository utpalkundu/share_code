package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage extends BasePage{

    private By firstName = By.id("User_FirstName");
    private By lastName = By.id("User_LastName");
    private By school = By.id("User_UserSchools");
    private By userType = By.id("User_UserTypeId");
    private By yearGroup = By.id("User_YearGroupId");
    private By save = By.xpath("//input[@value='Save']");
    private By pageHeader = By.tagName("h1");

    public CreateUserPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String fname){
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname){
        driver.findElement(lastName).sendKeys(lname);
    }

    public void selectSchool(String schoolName){
        Select selectSchool = new Select(driver.findElement((school)));
        selectSchool.selectByVisibleText(schoolName);
    }

    public void selectUserType(String userTp){
        Select selectUserType = new Select(driver.findElement((userType)));
        selectUserType.selectByVisibleText(userTp);
    }

    public void selectYearGroup(String yearGr){
        Select selectYearGroup = new Select(driver.findElement((yearGroup)));
        selectYearGroup.selectByVisibleText(yearGr);
    }

    public void clickSave(){
        driver.findElement(save).click();
    }

    public String getPageHeader(){
        return driver.findElement(pageHeader).getText();
    }


}
