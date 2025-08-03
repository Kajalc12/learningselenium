package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment
{
    public static void main(String[] args) throws InterruptedException
    {

        ChromeOptions options=new  ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/button[@id='okayBtn']")).click();
        Thread.sleep(2000);
//        dropdown value selection code
          WebElement element= driver.findElement(By.xpath("//select"));
          Select select= new Select(element);
          select.selectByVisibleText("Consultant");
          driver.findElement(By.xpath("//span/input")).click();
          driver.findElement(By.xpath("//parent::div//input[@id='signInBtn']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<products.size();i++)

        {

            products.get(i).click();

        }
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div//li//a[contains(@class, 'btn-primary')]")).click();

    }

}













//
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView()", element);