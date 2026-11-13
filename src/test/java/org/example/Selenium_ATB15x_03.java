package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_ATB15x_03 {
    @Test
    public void test_selenium_01()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Expected Title matches actual Title");
    }
}
