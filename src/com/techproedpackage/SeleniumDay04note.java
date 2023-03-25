package com.techproedpackage;

public class SeleniumDay04note {

    /*

    Selenium Day 4
====================
What do you remember from Day 3?
*** Locators :
* How many ?  -8
* What are they? -id,name,className,tagName,linkText, partialLinkText
NOTE: We can use them if and only if the correct attribute is in teh element.
Element 1: <p id="love-id-1" class="container"> I love Selenium 1 </p>
Element 2: <p id="love-id-2" class="container"> I love Selenium 2 </p>
***********By.id()****************
* driver.findElement(By.id("love-id-1"));
    => returns Element 1 as WebElement
    => WebElement element1=driver.findElement(By.id("love-id-1"));
* driver.findElements(By.id("love-id-1"));
    => returns Element 1 as List<WebElement>
    => List<WebElement> element1=driver.findElements(By.id("love-id-1"));
*********By.className()***********
* driver.findElement(By.className("container"));
    => returns Element 1 as WebElement
    => WebElement element1=driver.findElement(By.className("container"));
* driver.findElements(By.className("container"));
    => returns BOTH Element 1 and Element 2 as List<WebElement>
    => List<WebElement> myElements=driver.findElements(By.className("container"));
    for(WebElement each:myElements){
    System.out.println(each.getText()+" ");// prints I love Selenium 1 I love Selenium 2
    }
    for(int i=0; i<myElements.size();i++){
    System.out.println(myElement[i].getText()+" ");// prints I love Selenium 1 I love Selenium 2
    }
    System.out.println(myElement[0].getText());// prints I love Selenium 1
******By.tagName()*************
* driver.findElement(By.tagName("p"));
    => returns Element 1 as WebElement
    => WebElement element1=driver.findElement(By.tagName("p"));
* driver.findElements(By.tagName("p"));
    => returns BOTH Element 1 and Element 2 as List<WebElement>
    => List<WebElement> myElements=driver.findElements(By.className("container"));
    for(WebElement each:myElements){
    System.out.println(each.getText()+" ");// prints I love Selenium 1 I love Selenium 2
    }
    for(int i=0; i<myElements.size();i++){
    System.out.println(myElement[i].getText()+" ");// prints I love Selenium 1 I love Selenium 2
    }
    System.out.println(myElement[0].getText());// prints I love Selenium 1
EXCEPTIONS:
*driver.findElement(By.id("love-id-5"));// There is no element with love-id-5 id. NoSuchElement exception
*driver.findElement(By.name("container"));// There is no element with container name. NoSuchElement exception
**driver.findElements(By.name("container"));// There is no element with container name. Retuns empty list.
*****XPATH************************
Element 1: <p id="love-id-1" class="container" type="text"> I love Selenium 1 </p>
Element 2: <p id="love-id-2" class="container" type="text"> I love Selenium 2 </p>
tagName  : p
attribute: id            OR          class      OR        type
value    :love-id-1                container              text
XPATH : //tagName[@attribute='value'];
driver.findElement(By.xpath("//tagName[@attribute='value']"));
We use single quote!
All 3 xpath returns the same Element 1
//p[@id='love-id-1']
//p[@class='container']
//p[@type='text']
driver.findElement(By.xpath("//p[@id='love-id-1']")); => returns Element 1 as WebElement
driver.findElement(By.xpath("//p[@class='container']")); => returns Element 1 as WebElement
driver.findElements(By.xpath("//p[@class='container']")); => retuns BOTH Element 1 and Element 2 as List<Element>
What if I want to get the Element 2 only using xpath?
Then I can use index to find the uniqu element.Index starts at 1
To get Element 2 uniquly, then use index of 2
(//p[@class='container'])[1] => returns the 2nd element
driver.findElement(By.xpath("(//p[@class='container'])[2]")); => returns Element 1 as WebElement
ABSOLUTE XPATH:
//body/div/div/h2 => Sign in Element
//body/div/div/div/div/form/div[2]/input  => password input
RELATIVE XPATH:
Multiple ways.
How do you handle dynamic elements?
Dynamic elements means the element whose attribute values can change
Element 1: <p id="love-id-123-selenium" > I love Selenium 1 </p>
xpath = //p[@id='love-id-123']
When you refresh the page, then element id changes
Element 1: <p id="love-id-125-selenium" > I love Selenium 1 </p>
xpath = //p[@id='love-id-125']
When you refresh the page, then element id changes
Element 1: <p id="love-id-425-selenium" > I love Selenium 1 </p>
xpath = //p[@id='love-id-425']
So our code will fail
To handle this, we can write dynamic xpath.
- Identify what is not changing: love-id  AND selenium
- choose one of the dynamic xpath:
//*[starts-with(@attribute,'value')]
//tag[ends-with(@attribute,’value')]
//tag[contains(@attribute,'value')]
- //*[starts-with(@id,'love-id')]
 //p[ends-with(@id,'selenium')]
 //p[contains(@id,'love-id')]   OR  //p[contains(@id,'id')] OR  //p[contains(@id,'selenium')]
NOTE: THIS IS NOT COMMON. BUT WE NEED TO BE AWARE OF THE DYNAMIC ELEMENT
********I can use multiple attributes to find the ements
Normally writng only one attribute is enough. But we have to ability to pass multiple attributes
//input[@type='email' and @id='session_email']  => LOCATE IF BOTH ATTRIBUTES ARE ON THE ELEMENT
//input[@type='email' or @id='session_email']   => LOCATE AT LEAST ONE ATTRIBUTE IS ON THE ELEMENT

     */
}
