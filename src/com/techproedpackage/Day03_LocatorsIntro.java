package com.techproedpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Day03_LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
//        Create main method and complete the following task.
//        user goes to http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Mr Deniz\\Documents\\SeleniumDependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
//        Locate the elements of email textbox, password textbox, and signin button
//        Enter below username and password then click sign in button
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        emailTextbox.sendKeys("testtechproed@gmail.com");
//        sendKeys() => types inside the input box
        WebElement passwordTextbox=driver.findElement(By.id("session_password"));
        passwordTextbox.sendKeys("Test1234!");
        WebElement signinButton=driver.findElement(By.name("commit"));
        signinButton.click();//click() is used to click on the elements
//      SO FAR WE AUTOMATED LOGIN FUNCTIONALITY OF THE APPLICATION
        Thread.sleep(3000);
//        Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
        WebElement userId=driver.findElement(By.className("navbar-text"));
        String userIdText=userId.getText();// getText() returns text of the element as String
        String expectedUseId="testtechproed@gmail.com";
        if (userIdText.equals(expectedUseId)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ID : "+userIdText);
            System.out.println("EXPECTED ID : "+expectedUseId);
        }
//        Verify the Addresses and Sign Out  texts are displayed
        //Finding and verifying the the Addresses element
        WebElement addresses=driver.findElement(By.partialLinkText("Addresses"));
        if(addresses.isDisplayed()){//isDisplayed() => return true if webelement is on the page
            // returns false if element is not on the page
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ELEMENT IS DISPLAYED : "+addresses.isDisplayed());
        }
        //Finding and verifying the the SignOut element
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if(signOut.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ELEMENT IS DISPLAYED : "+signOut.isDisplayed());
        }
//        Find the number of total link on the page
//        a is used to create the links
//        we can use tagName = a to find total number of links
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));//findElements() => returns ALL matching elements as List<WebElement>
        //return ALL element whose tag=a
        System.out.println("There are "+allLinks.size()+" links on the page");
//        Sign out from the page
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign out")).click();
        //SO FAR SO GOOD
//        We need to understand the user is not longer signed in
        WebElement homeLink=driver.findElement(By.partialLinkText("Home"));
        if(homeLink.isDisplayed()){
            System.out.println("SIGN OUT IS SUCCESS");
        }else{
            System.out.println("SIGN OUT FAILED");
        }

        driver.quit();
    }
}