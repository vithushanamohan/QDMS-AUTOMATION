package com.qa.automation.qdms.pages.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage {
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement Master;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp active'][@href='#/master/plantlevel']")
	public static WebElement MainPlant;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/equipmentlevel']")
	public static WebElement MainEqupment;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/materiallevel']")
	public static WebElement MainMaterial;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/customerlevel']")
	public static WebElement MainCustomer;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/supplierlevel']")
	public static WebElement MainSupplier;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/employeelevel']")
	public static WebElement MainEmployee;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Sbu;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Plant;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Equipment;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement PlantEquipment;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement MaterialMainCategory;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement MaterialSubCategory;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement MaterialState;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[4]")
	public static WebElement Source;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[5]")
	public static WebElement Material;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[6]")
	public static WebElement Unit;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Customer;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Project;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement Delivery;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement SupplierCategory;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Supplier;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Designation;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Role;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement Employee;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[4]")
	public static WebElement User;
}
