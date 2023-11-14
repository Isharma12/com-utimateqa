package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class ComUtiMateQa {
    static String baseUrl = "https://courses.ultimateqa.com/";
    static String browser = "Chrome"; // declared globally
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("EdgeDriver")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");

        }
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page.
        System.out.println(driver.getTitle());
        //Print the current url.
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Click on sign in link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Abc@gmail.com");
        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("xyz@123");
        //Click on login button
        driver.findElement(By.partialLinkText("Sign")).click();
        //Navigate to the base URL
        driver.navigate().to(baseUrl);
        //Navigate forward to Homepage.
        driver.navigate().forward();
        //Navigate back to baseUrl
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.quit();

    }
}
