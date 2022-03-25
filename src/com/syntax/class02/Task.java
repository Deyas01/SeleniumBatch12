package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ct100_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ct100_MainContent_password")).sendKeys("Test");
        driver.findElement(By.className("button")).click();

        String title = driver.getTitle();
        if(title.equals("Web Orders")) {
        System.out.println("Title Is Correct");
    }else{
        System.out.println("Title Is not Correct");
    }
    driver.findElement(By.linkText("Logout")).click();
    driver.quit();
        }
    }
