package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    2.Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
3.Verify if the page URL contains facebook if not, print the right url.
4.Then Navigate to https://www.walmart.com/
 5.Verify if the walmart page title includes “Walmart.com” 6.Navigate back to facebook
7.Refresh the page 8.Maximize the window
9.Close the browser
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedTitle01 = "facebook";
        String actualTitle01 = driver.getTitle();

        if (actualTitle01.equals(expectedTitle01)) {
            System.out.println("PASS-01");
        } else {
            System.out.println("FAILED");
            System.out.println("EXPECTED =  " + expectedTitle01);
            System.out.println("ACTUAL " + actualTitle01);
        }

        //3.Verify if the page URL contains facebook if not, print the right url.
        String actualURL01 = driver.getCurrentUrl();

        if (actualURL01.contains(expectedTitle01)) {
            System.out.println("PASS-02 ");
        } else {
            System.out.println("FAILED");
            System.out.println("EXPECTED =  " + expectedTitle01);
            System.out.println("ACTUAL = " + actualURL01);
        }

        // 4.Then Navigate to https://www.walmart.com/
        driver.navigate().to("https://www.walmart.com/");

        // 5.Verify if the walmart page title includes “Walmart.com”
        String expectedTitle02 = "Walmart.com";
        String actualURL02 = driver.getCurrentUrl();

        if (actualURL02.contains(expectedTitle02)) {
            System.out.println("PASS-03");
        } else {
            System.out.println("FAILED");
            System.out.println("EXPECTED =  " + expectedTitle02);
            System.out.println("ACTUAL " + actualURL02);

            // 6.Navigate back to facebook
            driver.navigate().back();

            // 7.Refresh the page
            driver.navigate().refresh();

            // 8.Maximize the window
            driver.manage().window().maximize();

            // 9.Close the browser
            driver.quit();

        }
    }
}
