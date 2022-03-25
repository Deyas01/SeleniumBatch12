package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    /*navigate to fb.com
   --> click on create new account --> fill up all the text boxes
   --> click on sign up button--> close the popup --> close the browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000); // pause the execution for 2 secs
        driver.findElement(By.name("firstname")).sendKeys("Sayed");
        driver.findElement(By.name("lastname")).sendKeys("Zafar");
        driver.findElement(By.name("reg_email__")).sendKeys("Sayed.zafar123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sayed.zafar123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Sayed12345");
        driver.findElement(By.name("birthday_month")).sendKeys("01");
        driver.findElement(By.name("birthday_day")).sendKeys("02");
        driver.findElement(By.name("birthday_year")).sendKeys("1922"); // 100 years old, lol
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(4000); // pause the execution for 4 secs
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(4000); // pause the execution for 4 secs
        driver.close(); } }