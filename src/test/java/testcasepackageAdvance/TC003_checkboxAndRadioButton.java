package testcasepackageAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_001_checkbox_And_Radio;
import testCasePackage.Basedriver;

import java.time.Duration;

public class TC003_checkboxAndRadioButton extends Basedriver {
    public static String baseUrl="https://jqueryui.com/checkboxradio/";
    @Test
    public static void checkbox_and_radiobutton() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //switch to frame
        driver.switchTo().frame(0);
        PO_001_checkbox_And_Radio radioClass=new PO_001_checkbox_And_Radio(driver);
        radioClass.clickRadioButtonNewYork();
        Thread.sleep(5000);
        // no need to initialize again PO_001_checkbox_And_Radio starClass=new PO_001_checkbox_And_Radio();
        radioClass.clickStar();
        Thread.sleep(3000);

       // driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]/span[1]")).click();
       //Thread.sleep(2000);

        //driver.findElement(By.xpath("//body/div[1]/fieldset[2]/label[2]/span[1]")).click();
        //Thread.sleep(3000);
       // driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]")).click();
        //Thread.sleep(3000);
        //back to pages
        //click radio button with method

        //driver.clickRadioButtonNewYork(driver);



        driver.switchTo().defaultContent();
        //close site
        driver.close();

    }

}
