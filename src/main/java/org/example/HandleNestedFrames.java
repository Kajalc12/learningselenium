package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNestedFrames
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
//        this mentioned 3 lines below is wrong way
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
//        System.out.println(driver.switchTo().frame("//div[@id='content']"));
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
