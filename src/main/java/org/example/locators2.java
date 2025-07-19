package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class locators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));////something to get visible
        String password=getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String name="Kajal";
        driver.findElement(By.id("inputUsername")).sendKeys(name);
//        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+ name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//        driver.close();
    }

//    the below code is for not to hardcode password in code as we did in aove code in line 19
            public static String getPassword(WebDriver driver) throws InterruptedException

            {

                driver.get("https://rahulshettyacademy.com/locatorspractice/");

                driver.findElement(By.linkText("Forgot your password?")).click();

                Thread.sleep(1000);

                driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

                String passwordText =driver.findElement(By.cssSelector("form p")).getText();

                //Please use temporary password 'rahulshettyacademy' to Login.

                String[] passwordArray = passwordText.split("'");

                // String[] passwordArray2 = passwordArray[1].split("'");

                // passwordArray2[0]

                String password = passwordArray[1].split("'")[0];

                return password;

                //0th index - Please use temporary password

                //1st index - rahulshettyacademy' to Login.

                //0th index - rahulshettyacademy

                //1st index - to Login.
            }
}