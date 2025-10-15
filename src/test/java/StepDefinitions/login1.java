package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login1 {
    public static String browser = "chrome";
    public static WebDriver driver;
    @Given("browser is open")
    public void browser_is_open() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        System.out.println("Browser is open");
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/v1/");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}