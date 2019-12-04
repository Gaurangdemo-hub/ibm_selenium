package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_009POM {

private WebDriver driver; 
	
	public ELTC_009POM(WebDriver driver) {
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
	
	@FindBy (xpath="//*[@id=\"toolimage_2399\"]")
	private WebElement User;
	
	@FindBy (xpath="//input[@value='63']")
	private WebElement checkbox;
	
	@FindBy (xpath="//a[contains(@href,'/main/user/user.php?cidReq=SELEN099&id_session=78&gidReq=0&gradebook=0&origin=&type=5&unregister=yes&user_id=63')]")
	private WebElement unsub;
	

	
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

	public void User()
	{
	this.User.click();
	}
	
	public void Checkbox()
	{
		this.checkbox.isSelected();
		WebElement CB_user = driver.findElement(By.xpath("//input[@value='63']")); 
		CB_user.click();
	}
	
	public void Unsub()
	{
		this.unsub.click();
	}
	
	}


	
	
	
