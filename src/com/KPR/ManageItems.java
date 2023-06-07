package com.KPR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageItems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tm-demo.xyloinc.com/");
		driver.manage().window().maximize();
		
		//login to website
		//username field
		WebElement username=driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input"));
		username.sendKeys("admin");
		
		//password field
		
		WebElement password=driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input"));
        password.sendKeys("admin@123");
        
        //sign button
        
        WebElement signin=driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-login/div/div/div/div[1]/div/div[1]/div[2]/form/div[2]/button"));
        signin.click();
        
        //inventory
        Thread.sleep(3000);
        
        WebElement inventory=driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer/div/app-sidebar/div/aside/mat-accordion/mat-expansion-panel[5]/mat-expansion-panel-header/span[1]/span"));
        inventory.click();
        
        //manage items
        
        WebElement manageitems=driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer/div/app-sidebar/div/aside/mat-accordion/mat-expansion-panel[5]/div/div/mat-nav-list/a[1]/span/span[3]"));
        manageitems.click();
        
        WebElement additems=driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-drawer-container/mat-drawer/div/app-sidebar/div/aside/mat-accordion/mat-expansion-panel[5]/div/div/mat-nav-list/a[1]/span/span[3]"));
        additems.click();
	}

}
