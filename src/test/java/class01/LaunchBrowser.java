package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        // declairing the instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // use the driver.get() method
        driver.get("http://www.google.com");

        // maximize ur window
        driver.manage().window().maximize();

        String currentURL = driver.getCurrentUrl();

        System.out.println("the current url is: " + currentURL);

        String title = driver.getTitle();
        System.out.println("the title of the page is: " + title);
    }
}
