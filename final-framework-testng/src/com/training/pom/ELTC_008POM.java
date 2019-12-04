package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_008POM {

private WebDriver driver; 
	
	public ELTC_008POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//----------------Web Elements---------------
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[1]/a")
	private WebElement createCourse;
	
	@FindBy(linkText="My courses")
	private WebElement myCourses;
	
	@FindBy (xpath="//*[@id=\"collapse_78\"]/div/div/div/div/div/div[2]/h4/a")
	private WebElement coursename;
	
	@FindBy (xpath="//*[@id=\"toolimage_2390\"]")
	private WebElement desicon;

	@FindBy (xpath="//*[@id=\"toolbar\"]/div/div/a[1]/img")
	private WebElement desicon1;
	
	@FindBy (id = "course_description_title")
	private WebElement courtitle;
	
	@FindBy (id ="course_description_submit")
	private WebElement Save;
	
	
	//-------------------Methods--------------------------------
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickcreatecourse()
	{
		this.createCourse.click();
	}

	public void clickmycourses()
	{
		this.myCourses.click();
	}
	
	public void clickcoursename()
	{
		this.coursename.click();
	}
	public void clickdesicon()
	{
		this.desicon.click();
	}
	public void clickdesicon1()
	{
		this.desicon1.click();
	}
	public void courTitle(String courTitle) 
	{
		this.courtitle.clear(); 
		this.courtitle.sendKeys(courTitle); 
	}
	
	public void clickSave()
	{
		this.Save.click();
	}
	
	
	}
	
