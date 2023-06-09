package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class ProjectsPage extends TestBase
{
	@FindBy(id="menu_admin_ProjectInfo")
	WebElement ProjectInfo;
	
	@FindBy(id="menu_admin_viewProjects")
	WebElement Projects;
	
	@FindBy(id="btnAdd")
	WebElement Add;
	
	@FindBy(id="addCustomerLink")
	WebElement cName;
	
	@FindBy(id="addCustomer_customerName")
	WebElement addCName;
	
	@FindBy(id="addCustomer_description")
	WebElement addCDescription;
	
	@FindBy(id="dialogSave")
	WebElement savecDetails;
	
	@FindBy(id="dialogCancel")
	WebElement cancelCDetails;
	
	
	@FindBy(id="addButton")
	WebElement addAnotherAdmin;
	
	
	@FindBy(id="addProject_projectName")
	WebElement pName;
	
	@FindBy(id="addProject_projectAdmin_1")
	WebElement pAdmin;
	
	@FindBy(id="addProject_description")
	WebElement Description;
	
	@FindBy(id="btnSave")
	WebElement Save;
	
	@FindBy(id="btnCancel")
	WebElement Cancel;
	
	public ProjectsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickProjectInfo()
	{
		ProjectInfo.click();
	}
	public void clickProjects()
	{
		Projects.click();
	}
	
	public void clickAdd()
	{
		Add.click();
	}
	public void clickCustomerLink()
	{
		cName.click();
	}
	public void aAddCName()
	{
		//addCName.click();
		addCName.sendKeys("Nyx");
	}
	public void addCDesc()
	{
		addCDescription.click();
		addCDescription.sendKeys("Bank");
	}
	public void saveCdetail()
	{
		savecDetails.click();
	}
	public void clickProjectName()
	{
		
		pName.sendKeys("BankApp");
	}
	public void clickProjectAdmin()
	{
		
		pAdmin.sendKeys("Sushmitha bhojappa");
		
	}
	public void clickDescription()
	{
	
		Description.sendKeys("Bank Application");
	}
	public void clickSave()
	{
		//Save.click();
		Save.submit();
	}
	public void clickCancel()
	{
		Cancel.click();
	}
}
