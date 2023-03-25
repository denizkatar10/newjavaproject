package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {

    //    Create main method
    public static void main(String[] args) {
        //    Set Path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\geckodriver.exe");

        //    Create gecko driver
        WebDriver driver = new FirefoxDriver();
        //    Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        //    // Maximize the window
        driver.manage().window().maximize();

        //    Close/Quit the browser
        driver.close();

    }

}