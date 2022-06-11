package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC006_Scroll extends Basedriver{
    public static String baseurl="https://www.seleniumhq.org";
    @Test
    public static void scroll() throws InterruptedException {
        driver.get(baseurl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;
        //scroll to bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight); ");
        Thread.sleep(5000);
        //scroll to top
        js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
        Thread.sleep(5000);
        //scroll to specific element
        WebElement e=driver.findElement(By.xpath("//body/div[1]/main[1]/div[10]"));
        js.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(5000);

    }
}
