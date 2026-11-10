package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ATB15x_02 {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com"); // first task
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        System.out.println("Browser opened and all the three tasks performed !!");
    }
}
