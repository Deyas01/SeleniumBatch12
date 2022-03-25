package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
  /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        --> fill out the form --> click on register --> close the browser */
  public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
      driver.findElement(By.id("customer.firstName")).sendKeys("Sayed");
      driver.findElement(By.id("customer.lastName")).sendKeys("Deyas");
      driver.findElement(By.id("customer.address.street")).sendKeys("12345 Bridge St");
      driver.findElement(By.id("customer.address.city")).sendKeys("Sacramento");
      driver.findElement(By.id("customer.address.state")).sendKeys("CA");
      driver.findElement(By.id("customer.address.zipCode")).sendKeys("95691");
      driver.findElement(By.id("customer.phoneNumber")).sendKeys("1233211234");
      driver.findElement(By.id("customer.ssn")).sendKeys("123121234");
      driver.findElement(By.id("customer.username")).sendKeys("Sayed");
      driver.findElement(By.id("customer.password")).sendKeys("Deyas");
      driver.findElement(By.id("repeatedPassword")).sendKeys("Deyas");
      Thread.sleep(3000); // pause the execution for 3 secs
      driver.findElement(By.className("button")).click();
      driver.close();
  }
}