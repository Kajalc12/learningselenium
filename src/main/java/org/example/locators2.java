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
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String name="Kajal";
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("submit")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+ name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//        driver.close();
    }

}