package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}

