package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PO002_locatorLearning {
    public WebDriver driver = null;

    public PO002_locatorLearning(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By userNamefield = By.id("inputUsername");

//driver.findElement(By.id("inputUsername")).

    //sendKeys("Mehedi");

    public void sendUsername(String name){
        driver.findElement(userNamefield).sendKeys(name);
    }


}
