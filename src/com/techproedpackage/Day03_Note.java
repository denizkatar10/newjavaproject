package com.techproedpackage;

public class Day03_Note {
    /*
    Selenium Day 3
=================
​
How many locators are there?
=========
There are 8 locators
1. id
2. className ==>> class="form-control"
3. name
4. tagName
5. linktext
6. partialLinkText
7. xpath
8. cssLocator
==========
EMAIL ELEMENT:
<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
​
IMPORTANT TERMS:
tag       : input
attribute : type,      class,    placeholder,   data-test ,     name,         id
value     : email, form-control,   Email,         email   ,  session[email], session_email
​
===========findElement(By.LOCATORNAME("LOCATOR VALUE"))========
findElement() returns single WebElement
findElement() returns THE FIRST ELEMENTS WHEN THERE ARE MULTIPLE ELEMENTS
​
1. Find Element By.id
WebElement emailTextbox=driver.findElement(By.id("session_email"));
2. Find Element By.className
WebElement emailTextbox=driver.findElement(By.className("form-control"));
3. Can I use By.name  to finf email textbox element?
ANSWER: YES b/c name="session[email]"
4. Can I use By.tagName to find the element?
ANSWER: YES if it is unique tag : input
5. Can I use by.linkText to find the input element?
ANSWER: NO b/c input is not a link
6. Can I use by.partialLinkText to find the input element?
ANSWER: NO b/c input is not a link
7. Can I use by.xpath
ANSWER: Yes b/c we can use xpath for any element
8. cssLocator
ANSWER: Yes b/c we can use css locator for any element
​
PASSWORD ELEMENT:
<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" >
1. Find Element By.id
WebDriver passwordTextbox=driver.findElement(By.id("session_password"));
2. Find Element By.className
WebElement passwordTextbox=driver.findElement(By.className("form-control"));
​
​
class="form-control" is in email and password elements
driver.findElement(By.className("form-control")); will return email element becuase findElement ONLT RETURN THE 1st ELEMENT WHEN THERE ARE MULTIPLE MATCH
​
​
5. linktext
ADDRESSES ELEMENT:
<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
This element is a link, hence I can use linkText or partialLinkText
driver.findElement(By.linkText(" EXACT TEXT OF THE LINK WITH SPACE AND ALL "))
WebElement addresses=driver.findElement(By.linkText("Addresses"));
WebElement addresses=driver.findElement(By.linkText("Address"));=> WONT WORK
​
6. partialLinkText
This element is a link, so I can also use partialLinkText as well
driver.findElement(By.partialLinkText(" WHOLE OR PART OF THE TEXT "));
ALL BELOWS WORKS.
WebElement addresses=driver.findElement(By.partialLinkText("Addresses"));
WebElement addresses=driver.findElement(By.partialLinkText("Addr"));
WebElement addresses=driver.findElement(By.partialLinkText("resses"));
WebElement addresses=driver.findElement(By.partialLinkText("dress"));
We use ally prefer partialLinkText over linkText when the text id too long or when there are spaces in the beginning or at the end of the element
     */
}
