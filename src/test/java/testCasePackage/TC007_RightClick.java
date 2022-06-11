package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC007_RightClick extends Basedriver{
    public static String baseurl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
    @Test
    public static void right_click() throws InterruptedException {
        driver.get(baseurl);



        //driver.switchTo().frame("iframeResult");
        Actions a=new Actions(driver);
        WebElement doubleClick=driver.findElement(By.xpath("//button[@id='runbtn']"));
        a.doubleClick(doubleClick).build().perform();
        Thread.sleep(200);

        WebElement rightClick=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
        a.contextClick(rightClick).build().perform();
        Thread.sleep(2000);

       // driver.switchTo().defaultContent();

        //right click
        //draganddrop
        //keydown
        //keyup
        //release
    }
}
