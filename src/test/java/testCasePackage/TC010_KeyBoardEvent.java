package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class TC010_KeyBoardEvent extends Basedriver{
    public static String baseUrl="http://automationpractice.com/index.php";
    @Test
    public static void key_board_event() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement e =driver.findElement(By.xpath("//input[@id='search_query_top']"));
        Thread.sleep(3000);
        e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
        //driver.findElement(locator).sendKeys(Keys.chord(Keys.SHIFT,Keys.CONTROL,Keys.DELETE));
        e.sendKeys(Keys.chord(Keys.ENTER));
        Thread.sleep(2000);

    }
}
