package testCasePackage;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC005_Refresh extends Basedriver {
    public static String baseurl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
    @Test
    public void refreshPage() throws InterruptedException {
        driver.get(baseurl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

    }
}
