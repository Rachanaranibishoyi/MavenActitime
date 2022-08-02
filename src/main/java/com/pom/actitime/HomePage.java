package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsbutton;
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavebutton;
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofworkbutton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod()
	{
		logoutLink.click();
	}
	public void settings() {
		settingsbutton.click();
	}
	public void leave() {
		leavebutton.click();
	}
	public void task()
	{
		taskbutton.click();
	}
	public void typeofwork() 
	{
		typeofworkbutton.click();
	}
}
