package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        
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
