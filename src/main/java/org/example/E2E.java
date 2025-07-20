package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();

        driver.get("http://spicejet.com"); //URL in the browser

        driver.findElement(By.className("css-76zvg2")).click(); //select radio button code from round/single trip
        //select city from dropdowns code

        driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).sendKeys("IDR");

//        driver.findElement(By.xpath("//a[@value='DEL']")).click();

        Thread.sleep(2000);
//        //select date from calender code

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {

            System.out.println("its disabled");

            Assert.assertTrue(true);


        }

        else

        {

            Assert.assertTrue(false);

        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();


        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        for(int i=1;i<5;i++)

        {

            driver.findElement(By.id("hrefIncAdt")).click();

        }


        driver.findElement(By.id("btnclosepaxoption")).click();

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

        driver.findElement(By.cssSelector("input[value='Search']")).click();

// driver.findElement(By.xpath("//input[@value='Search']")).click();

// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();


    }

}
