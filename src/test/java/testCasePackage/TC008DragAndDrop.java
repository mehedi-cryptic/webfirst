package testCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC008DragAndDrop extends Basedriver{
public static String baseurl="https://jqueryui.com/droppable/";
@Test
    public static void drag_and_drop() throws InterruptedException {
    driver.get(baseurl);

    Thread.sleep(2000);

    //Drag and drop
    driver.switchTo().frame(0);

    WebElement e1=driver.findElement(By.id("draggable"));
    WebElement e2=driver.findElement(By.id("droppable"));

    Actions a=new Actions(driver);
    a.dragAndDrop(e1,e2).build().perform();
    Thread.sleep(2000);
    driver.switchTo().defaultContent();
}
}
