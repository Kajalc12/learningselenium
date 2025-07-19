package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        WebDriver driver =new ChromeDriver();

        driver.get("http://spicejet.com"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);
//        below scenario happens when multple instance appear lets say 2 calender window then if will try to check a date in
//        both calender so one get hidden that y used[2] index
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//here with respect to above we optimised and taken parent locator of 2nd calender n then called specific element inside it
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

    }
}
