package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.os.WindowsUtils;

import java.io.File;

public class Screenshots {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("id('email')")).sendKeys("kajal");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
//            WindowsUtils.killByName("excel.exe");
            driver.manage().deleteCookieNamed("sessionKey");

            //click on any link
            //login page- verify login url


		    driver.get("http://google.com");

			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src,new File("C:\\Users\\JAVA_Codes\\screenshot.png"));

}

}
