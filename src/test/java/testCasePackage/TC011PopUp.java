package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC011PopUp extends Basedriver{
    public static String baseUrl="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
    @Test
    public static void alertHandlingCheck() throws InterruptedException {
        driver.get(baseUrl);

        Thread.sleep(2000);

        WebElement b=driver.findElement(By.name("iframeResult"));
        driver.switchTo().frame(b);
        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);


    }
}
