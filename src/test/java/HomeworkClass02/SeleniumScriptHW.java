package HomeworkClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumScriptHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS.SECONDS);

        WebElement txtUserName = driver.findElement(By.name("username"));
        txtUserName.sendKeys("abc");

        txtUserName.sendKeys(Keys.CONTROL + "a");
        txtUserName.sendKeys(Keys.DELETE);

        txtUserName.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement submitBtn = driver.findElement(By.tagName("button"));
        System.out.println(submitBtn.getText());
        submitBtn.click();



    }
}
