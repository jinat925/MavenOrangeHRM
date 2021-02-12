package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id = "txtUsername")
private WebElement untbx;

@FindBy(id = "txtPassword")
	private WebElement pwtbx;

@FindBy(id = "btnLogin")
private WebElement lgbtn;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void setlogin(String un, String pwd) {


untbx.sendKeys(un);
pwtbx.sendKeys(pwd);
lgbtn.click();
}
}