package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(id = "welcome")
private WebElement userIcon;

@FindBy(xpath = "//a[@href='/index.php/auth/logout']")
private WebElement logoutlink;

public Homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver,this);
}

public void setlogout() 
{
	userIcon.click();
	logoutlink.click();
	
}

}
