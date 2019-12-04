package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_007POM {

private WebDriver driver; 
	
	public ELTC_007POM(WebDriver driver) {
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
	
	@FindBy(id="title")
	private WebElement titleBox;
	
	@FindBy(id="advanced_params")
	private WebElement advncSetting;
	
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/button/div/div/div")
	private WebElement cateGory;
	
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/div[1]/input")
	private WebElement enterVal;
	
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[1]/div[1]/div/div/div[2]/ul/li/a/span")
	private WebElement selectCategory;
	
	@FindBy(id="add_course_wanted_code")
	private WebElement courseCode;
	
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[3]/div[1]/div/button/div/div/div")
	private WebElement language;
	
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[3]/div[1]/div/div/div[1]/input")
	private WebElement LanguageBox;
	
	@FindBy(xpath = "//*[@id=\"advanced_params_options\"]/div[3]/div[1]/div/div/div[2]/ul/li/a")
	private WebElement LanguageBoxEng;
	
	@FindBy(id="add_course_submit")
	private WebElement courseBtn1;

	@FindBy(xpath="//*[@id=\"course_tools\"]/div[1]/div/div[1]/a")
	private WebElement addIntroicon;
	
	//@FindBy(class = "cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")
	//private WebElement frameBox;
	
	@FindBy(id="introduction_text_intro_cmdUpdate")
	private WebElement saveintrotext;
	

	
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
	
	public void TitleBox(String titleBox)
	{
		this.titleBox.clear();
		this.titleBox.sendKeys(titleBox);
	}
	
	public void clickadvncsetting()
	{
		this.advncSetting.click();
	}
	public void category()
	{
		this.cateGory.click();;
		this.enterVal.sendKeys("projects");
		this.selectCategory.click();
		//Select s1= new Select(cateGory);
		//s1.selectByValue(value);
	}

	public void courseCode(String courseCode) {
		this.courseCode.clear(); 
		this.courseCode.sendKeys(courseCode);
	}
	
	public void Language()
	{
		this.language.click();
		this.LanguageBox.sendKeys("English");
		this.LanguageBoxEng.click();
		
	}
	
	public void clickcrtcourse()
	{
		this.courseBtn1.click();
	}
	
	public void clickaddintroicon()
	{
		this.addIntroicon.click();
	}
	
//	public void TextBody(String TextBody) throws InterruptedException 
//	{
		//this.textBody.clear(); 
		//this.textBody.sendKeys(TextBody);
//		WebElement frameName = driver.findElement(By.xpath("//*[@title="));
//		driver.switchTo().frame(frameBox);
//		this.inputText.sendKeys(TextBody);
//		driver.switchTo().defaultContent();
//		Thread.sleep(9000);
	//}
	public void saveintrotext()
	{
		this.saveintrotext.click();
	}
	
}

