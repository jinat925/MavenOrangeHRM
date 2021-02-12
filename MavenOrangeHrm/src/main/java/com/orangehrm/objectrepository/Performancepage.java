package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Performancepage {
@FindBy(id = "//b[.='Performance']")
private WebElement performancedropdown;
@FindBy(id = "menu_performance_Configure")
private WebElement configuredropdown;
@FindBy(id = "menu_performance_searchKpi")
private WebElement kpiElement;
@FindBy(id = "btnAdd")
private WebElement addbtn;
@FindBy(id = "defineKpi360_jobTitleCode")
private WebElement selectElement;
@FindBy(id = "defineKpi360_keyPerformanceIndicators")
private WebElement indicatornameElement;
@FindBy(id = "defineKpi360_minRating")
private WebElement minimumrating;
@FindBy(id = "defineKpi360_maxRating")
private WebElement maximumratig;
@FindBy(id = "defineKpi360_makeDefault")
private WebElement checkbox;
@FindBy(id = "saveBtn")
private WebElement savebtn;
public Performancepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
	
public WebElement getPerformancedropdown() {
	return performancedropdown;
}
public WebElement getConfiguredropdown() {
	return configuredropdown;
}
public WebElement getKpiElement() {
	return kpiElement;
}
public WebElement getAddbtn() {
	return addbtn;
}
public WebElement getSelectElement() {
	return selectElement;
}
public WebElement getIndicatornameElement() {
	return indicatornameElement;
}
public WebElement getMinimumrating() {
	return minimumrating;
}
public WebElement getMaximumratig() {
	return maximumratig;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getSavebtn() {
	return savebtn;
}

}
