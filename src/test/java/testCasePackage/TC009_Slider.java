package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC009_Slider extends Basedriver{
public static String baseUrl="https://jqueryui.com/slider/";
@Test
    public static void slider() throws InterruptedException {
    driver.get(baseUrl);
    new WebDriverWait(driver, Duration.ofSeconds(30));
    driver.manage().window().maximize();
    Thread.sleep(20);

    driver.switchTo().frame(0);
    WebElement e=driver.findElement(By.xpath("//div[@id='slider']/span"));

    Actions a=new Actions(driver);
    a.dragAndDropBy(e,300,0).build().perform();
    Thread.sleep(2000);
    a.dragAndDropBy(e,200,0).build().perform();
    Thread.sleep(2000);
    driver.switchTo().defaultContent();

}
}
