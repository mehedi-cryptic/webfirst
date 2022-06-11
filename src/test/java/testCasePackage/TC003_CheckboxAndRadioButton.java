package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC003_CheckboxAndRadioButton extends Basedriver{

public static String baseeurl="https://jqueryui.com/checkboxradio/";
@Test
    public static void checkbox_and_radiobutton() throws InterruptedException {
    driver.get(baseeurl);
    new WebDriverWait(driver,Duration.ofSeconds(20));
    driver.manage().window().maximize();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    //switch to frame
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]/span[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//body/div[1]/fieldset[2]/label[2]/span[1]")).click();
    //Thread.sleep(3000);
    driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]")).click();
   Thread.sleep(3000);
    //back to pages
    driver.switchTo().defaultContent();
   //close site
    driver.close();

}

}

