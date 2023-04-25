package com.qa.automation.qdms.testcases.master;

import org.openqa.selenium.support.PageFactory;

import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.pages.master.NavigationPage;



public class MasterMainNavigationsTest extends DriverIntialization{
	static NavigationPage np = new NavigationPage();
//	Navigate Master
	public static void navigateMaster() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(3000);
		NavigationPage.Master.click();
	}
	
	
//	Navigate Plant
	public static void navigatePlantMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MainPlant.click();
	}
	
//	Navigate Equpment
	public static void navigateEqupmentMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MainEqupment.click();
	}
	
//	Navigate Material
	public static void navigateMaterialMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MainMaterial.click();
	}
	
//	Navigate Customer
	public static void navigateCustomerMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MainCustomer.click();
	}
	
//	Navigate Supplier
	public static void navigateSupplierMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MainSupplier.click();
	}

//	Navigate Employee
	public static void navigateEmployeeMain() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2500);
		NavigationPage.MainEmployee.click();
	}
	
	
//	Navigate SBU
	public static void navigateSbu(String testcase) throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Sbu.click();
	}
	
//	Navigate Plant
	public static void navigatePlant() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Plant.click();
	}
	
//	Navigate Equipment
	public static void navigateEquipment() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Equipment.click();
	}
	
//	Navigate PlantEquipment
	public static void navigatePlantEquipment() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.PlantEquipment.click();
	}
	
//	Navigate MaterialMainCategory
	public static void navigateMaterialMainCategory() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MaterialMainCategory.click();
	}
	
//	Navigate MaterialSubCategory
	public static void navigateMaterialSubCategory() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MaterialSubCategory.click();
	}
	
//	Navigate MaterialState
	public static void navigateMaterialState() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.MaterialState.click();
	}
	
//	Navigate Source
	public static void navigateSource() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Source.click();
	}
	
//	Navigate Material
	public static void navigateMaterial() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Material.click();
	}
	
//	Navigate Unit
	public static void navigateUnit() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Unit.click();
	}
	
//	Navigate Customer
	public static void navigateCustomer() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Customer.click();
	}
	
//	Navigate Project
	public static void navigateProject() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Project.click();
	}
	
//	Navigate Delivery
	public static void navigateDelivery() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Delivery.click();
	  
	  
	}
	
//	Navigate SupplierCategory
	public static void navigateSupplierCategory() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.SupplierCategory.click();
	}
	
	
//	Navigate Supplier
	public static void navigateSupplier() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Supplier.click();
	}
	
	
//	Navigate Designation
	public static void navigateDesignation() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Designation.click();
	}
	
	
//	Navigate Role
	public static void navigateRole() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Role.click();
	}
	
	
//	Navigate Employee
	public static void navigateEmployee() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.Employee.click();
	}
	
//	Navigate User
	public static void navigateUser() throws InterruptedException {
		PageFactory.initElements(driver, np);
		Thread.sleep(2000);
		NavigationPage.User.click();
	}
}
