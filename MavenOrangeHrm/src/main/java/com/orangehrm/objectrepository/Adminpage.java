package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement admindropdoWebElement;

@FindBy(id = "menu_admin_Organization")
private WebElement organizationElement;

@FindBy(id = "menu_admin_viewOrganizationGeneralInformation")
private WebElement generalinformationoption;

@FindBy(id = "btnSaveGenInfo")
private WebElement editbtn;



 @FindBy(id = "organization_name")
 private WebElement organizationNametbx;
 
 @FindBy(id = "organization_email")
 private WebElement organizationemailtbx;
 
 @FindBy(id = "btnSaveGenInfo")
 private WebElement savebtn;
 
 public Adminpage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
}
public WebElement getAdmindropdoWebElement() {
	return admindropdoWebElement;
}
public WebElement getOrganizationElement() {
	return organizationElement;
}
public WebElement getGeneralinformationoption() {
	return generalinformationoption;
}
public WebElement getEditbtn() {
	return editbtn;
}
public WebElement getOrganizationNametbx() {
	return organizationNametbx;
}
public WebElement getOrganizationemailtbx() {
	return organizationemailtbx;
}
public WebElement getSavebtn() {
	return savebtn;
}

}
 

