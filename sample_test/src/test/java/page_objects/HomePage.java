package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By users = By.linkText("Users");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickUsers(){
        driver.findElement(users).click();
    }
}
