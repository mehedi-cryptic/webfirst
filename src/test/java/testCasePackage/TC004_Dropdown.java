package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class TC004_Dropdown extends Basedriver{
    public static String baseUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
    @Test
    public static void dropdown() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement e=driver.findElement(By.name("cars"));
       // Thread.sleep(2000);
        Select s=new Select(e) ;

        s.selectByIndex(3);
        //Thread.sleep(2000);
        //for multiple selection

      //  Actions a=new Actions(driver);
//        a.keyDown(Keys.CONTROL).click(s.getOptions().get(1)).click(s.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

    }
}
