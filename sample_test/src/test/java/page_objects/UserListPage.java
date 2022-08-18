package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserListPage extends BasePage{

    private By createUser = By.xpath("//*[contains(text(),'Create User')]");

    public UserListPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateUsers(){
        driver.findElement(createUser).click();
    }
}
