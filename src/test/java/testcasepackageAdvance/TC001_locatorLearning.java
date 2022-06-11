package testcasepackageAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testCasePackage.Basedriver;

public class TC001_locatorLearning extends Basedriver {
   static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

    @Test
    public void locatorLearning() throws InterruptedException {
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("Mehedi");
        driver.findElement(By.name("inputPassword")).sendKeys("MehediBhuiyan");
        Thread.sleep(2000);


        //button[contains(text(),'Sign In')]
        //driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        //Thread.sleep(2000);

        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        //Thread.sleep(2000);
        //formula for id tag_name#value and for class tag_name.value

        driver.findElement(By.linkText("Forgot your password?")).click();
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mehedi Hasan");
        //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("mehedi@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01686855244");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mehedii");

       /* String password=getPassword(driver);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password); */
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
    }
    /*
    {
        public static String getPassword(WebDriver driver){
            driver.get(baseurl);
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
        //please use temporary passwrod rahulshetty to login
        String[] passwordArray=passwordText.split(" ' ");

        //String[] passwordArray2=passwordArray[1].split();
        //String [] password=passwordArray2[0];

        String password=passwordArray[1].split(" ' ").[0];



        return password;
    }

     */
    }
