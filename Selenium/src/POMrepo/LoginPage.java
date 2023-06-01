package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver){//ye constructor h jo load ho rha 
		PageFactory.initElements(driver, this);//init element sara static ko contructor k andr load kr rha
	}
	
	@FindBy(id="username")
	public WebElement usernameTextField;//ye ek web element hai jisko find by se dhundh kr use krnge aage k liye
										//isko kahin bhi use  kr skte ek baar bnane ke baad
	
	@FindBy(name="pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginButton;
	
	public void loginAction(String username,String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	

}
