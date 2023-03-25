package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Day02_VerifyTitleTest {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //1.Create a new class: VerifyTitleTest
        //2.Navigate to google homepage
        //3.Verify if google title is “google”
        String expected = "google";
        String actual = driver.getTitle();
        //getTitle(); -> Returns the title of the page AS STRING

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL : " + actual);
            System.out.println("EXPECTED: " + expected);
        }
        //NOTE: Test case failed, so we found a bug. Google =! google.
        //When we find a bug we follow the steps :
        //1. Run the scripts again to make sure the test case is failing
        //2. Test the functionality manually to make sure
        //3. Communicate with BA, or Dev, or PO.

        //4. Should I open a ticket if that is a bug?
        //Follow the company culture.
        //Some companies we can open ticket whenever we find a bug,
        //sometimes it is a quick fix, so we talk to Dev to fix it.

        //SPRINT:
    }
}