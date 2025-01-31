package org.parabank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=DB7E422442D1BBA8A7E1571A54FDE5FC");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("newusername");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("newPass@123");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        Thread.sleep(4000);
        driver.quit();
}
}
