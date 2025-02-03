package org.parabank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sanket");
        driver.findElement(By.id("customer.lastName")).sendKeys("Manmode");
        driver.findElement(By.id("customer.address.street")).sendKeys("121 Teacher colony");
        driver.findElement(By.id("customer.address.city")).sendKeys("Nagpur");
        driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("442203");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9685749685");
        driver.findElement(By.id("customer.ssn")).sendKeys("456");
        driver.findElement(By.id("customer.username")).sendKeys("Username123");
        driver.findElement(By.id("customer.password")).sendKeys("Pass@123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Pass@123");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();


    }
}
