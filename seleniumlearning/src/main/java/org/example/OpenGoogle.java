package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args){
        //open google
        //go to the chrome driver

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
