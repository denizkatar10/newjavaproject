package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    //This is our first JAVA Automation class
    //1. Create main method in JAVA class

    //main -> main method
    public static void main(String[] args){

        //2.System.setProperty("DRIVER TYPE", "DRIVER PATH")
        // DRIVER TYPE FOR CHROME: webdriver.chrome.driver
        // DRIVER PATH : "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\chromedriver.exe"
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\chromedriver.exe");

        //3. Create WebDriver object
        WebDriver driver = new ChromeDriver();
        //NOTE: if selenium libraries are not imported, then import the selenium libraries one

        //STEP 1, 2, 3 are mandatory for Java Automation frameword.
        //NOTE: When we learn maven, we will not fallow these steps. It will be shorter


        //4. Now that we are done with setup, we can write automation script
        //Going to google
        driver.get("https://www.google.com");





    }

}
