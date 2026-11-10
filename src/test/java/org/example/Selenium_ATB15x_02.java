package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ATB15x_02 {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        System.out.println("Browser opened");
    }
}
