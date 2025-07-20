package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addtocart_e2e {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//        System.out.println("kajal");
//        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//        Thread.sleep(4000);
//        for (int i = 0; i < products.size(); i++) {
//            String name = products.get(i).getText();
//            if (name.contains("Cucumber")) {
////                //click on add to cart
//                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//                break;
//
//            }
//        }
//    }


    //This is dynamic code to select any vegetable anytime just by adding them in array
//    public class Arraylistconcept {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            int j=0;
            String[] itemsNeeded = {"Brocolli", "Cauliflower", "Cucumber"}; //normal array
            List itemsNeededList = Arrays.asList(itemsNeeded); //converted to arraylist
            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
            for (int i = 0; i < products.size(); i++) {
                String[] name = products.get(i).getText().split("-");//needed to format to get actual vegetable name currently getting Cucumber -1 kg like this mow got Cucumber  with 1 space
                String formattedName = name[0].trim();
                if (itemsNeededList.contains(formattedName)) {
                    j++;
               //click on add to cart
                    Thread.sleep(4000);
                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                    if(j==itemsNeeded.length)
                    {
                        System.out.println("size of itemsneeded "+ itemsNeeded.length);
                        break;
                    }

                }
            }
        }
    }

