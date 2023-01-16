package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-email")).sendKeys("Kartikjain01@test.com");
        driver.findElement(By.id("input-password")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        if (driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled()) {
            System.out.println("Logout link is present in homepage");
        }
        else {
            System.out.println("Logout link button is not present");
        }

        driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();

    }
}
