package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ATB15x_02 {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com"); // first task
        System.out.println("Title is -->" +driver.getTitle());
        System.out.println("Current URL is --> " +driver.getCurrentUrl());
        System.out.println("Page Source is as below --> " +driver.getPageSource());

        System.out.println("Browser opened and all the three tasks performed !!");
    }
}
