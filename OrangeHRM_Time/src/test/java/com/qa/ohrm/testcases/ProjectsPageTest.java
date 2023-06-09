package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.ProjectsPage;
import com.qa.ohrm.pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ProjectsPageTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	ProjectsPage pp;
	
  @Test(priority=15)
  public void ProjectInfo() 
  {
	  pp.clickProjectInfo();
  }
  
  
  @Test(priority=16)
  public void Projects() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
  }
  
  @Test(priority=17)
  public void Add() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
	  pp.clickAdd();
  }
  
  @Test(priority=18)
  public void CustomerLink() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
	  pp.clickAdd();
	  pp.clickCustomerLink();
  }
  
  @Test(priority=19)
  public void cName() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
	  pp.clickAdd();
	  pp.clickCustomerLink();
	  pp.aAddCName();
  }
	
	
  @Test(priority=20)
  public void cDesc() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
	  pp.clickAdd();
	  pp.clickCustomerLink();
	  pp.aAddCName();
	  pp.addCDesc();
  }
  
  @Test(priority=21)
  public void saveDetails() 
  {
	  pp.clickProjectInfo();
	  pp.clickProjects();
	  pp.clickAdd();
	  pp.clickCustomerLink();
	  pp.aAddCName();
	  pp.addCDesc();
	  pp.saveCdetail();
  }
	@Test(priority=22)
	  public void clickPName() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
		  pp.saveCdetail();
		  pp.clickProjectName();
	  }
	@Test(priority=23)
	  public void clickPAdmin() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
		  pp.saveCdetail();
		  pp.clickProjectName();
		  pp.clickProjectAdmin();
	  }
	
	@Test(priority=24)
	  public void clickDesc() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
		  pp.saveCdetail();
		  pp.clickProjectName();
		  pp.clickProjectAdmin();
		  pp.clickDescription();
	  }
	@Test(priority=25)
	  public void cSave() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
		  pp.saveCdetail();
		  pp.clickProjectName();
		  pp.clickProjectAdmin();
		  pp.clickDescription();
		  pp.clickSave();
	  }
	
	
  @BeforeMethod
  public void launchURL() 
  {
	  initialization();
	  driver.get(prop.getProperty("url"));
	  lp = new LoginPage();
	  hp = new HomePage();
	  tp = new TimePage();
	  lp.login();
	  hp.clickTime();
	  pp = new ProjectsPage();
	 
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.close();
  }

}
