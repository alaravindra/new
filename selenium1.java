package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(2000L);
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium driver");
driver.findElement(By.xpath("//input[@cass='gNO89b']")).click();
}


}
// hii ravindhra
