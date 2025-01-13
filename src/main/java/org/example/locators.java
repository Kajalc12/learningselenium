package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));////something to get visible
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);  //something to get stable
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chrish@rsa.com");
        //        way to write indexing in css and xpath
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rache@rsa.com");
//        parent child traverse in xpath
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9874576234");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        //        parent child traverse in css
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        driver.findElement(By.id("chkboxOne")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);

//        driver.findElement(By.className("chkboxTwo")).click();

//        above one is called regular expression.

//        driver.close();
    }
}
