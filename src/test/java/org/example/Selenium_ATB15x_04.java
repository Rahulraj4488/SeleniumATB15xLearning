package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Selenium_ATB15x_04 {
    @Test
    public void test_selenium_01() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Expected Title matches actual Title");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isNotNull();
    }
}
