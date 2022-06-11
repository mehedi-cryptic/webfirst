package pageObjectPackage;

import testCasePackage.Basedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static testCasePackage.Basedriver.driver;


public class PO_001_checkbox_And_Radio    {
    public  WebDriver driver=null;
    public PO_001_checkbox_And_Radio(WebDriver driver)
    {
        this.driver=driver;
    }
    By newYorkRadioButton = By.xpath("//body/div[1]/fieldset[1]/label[1]/span[1]");
    By fivestarCheckBox=By.xpath("//body/div[1]/fieldset[2]/label[2]/span[1]");
    public void clickRadioButtonNewYork(){
        driver.findElement(newYorkRadioButton).click();

    }
    public void clickStar(){
        driver.findElement(fivestarCheckBox).click();

    }


}
