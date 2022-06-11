package testCasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC002_VerifyPageTitle extends Basedriver {
    public static String baseurl = "http://automationpractice.com/index.php";

    @Test(priority = 1)
    public void verify_page_title() {
        driver.get(baseurl);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

        String found_title = driver.getTitle();
        System.out.println("The title of the site is :" + found_title);
    }



    @Test(priority = 2)
    public  void is_website_secured() {

        String y = driver.getCurrentUrl();
        System.out.println(y);
        if (y.contains("https")) {
            System.out.println("Site is secured");
        } else {
            System.out.println("Site is not secured");
        }
    }
}





