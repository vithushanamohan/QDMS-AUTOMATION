package com.qa.automation.qdms.testcases.materialmaincategory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.commonmethods.PropertiesCommonMethods;
import com.qa.automation.qdms.pages.master.MaterialMainCategoryPage;
import com.qa.automation.qdms.testcases.login.LoginTest;
import com.qa.automation.qdms.testcases.master.MasterMainNavigationsTest;
import com.qa.automation.qdms.testcases.plant.MultiSearchMethods;

public class SingleSearchMainCategory extends DriverIntialization {
	static boolean mainCategoryTableData = true;

//********************************************************************************************************
//   THE METHOD IS FOR GENERATING REPORT 
//********************************************************************************************************      
	public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
		boolean position = true;
		ExtentTest testCase = extent.createTest(TestCaseName);
		try {
			AssertJUnit.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
			testCase.log(Status.INFO, "Correct value");
			testCase.log(Status.PASS, actualValue);
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
			testCase.log(Status.INFO, "wrong value");
			testCase.log(Status.FAIL, actualValue);
		}

	}

	@Test
	public static void singleSearch() throws InterruptedException, IOException {

		MaterialMainCategoryPage pg = new MaterialMainCategoryPage();
		PageFactory.initElements(driver, pg);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
//login
		LoginTest.Login();
		MasterMainNavigationsTest.navigateMaster();
		MasterMainNavigationsTest.navigateMaterialMain();
		MasterMainNavigationsTest.navigateMaterialMainCategory();

		// get data from excel

		XSSFRow row = null;
		XSSFCell cell = null;
		DataFormatter dataValue = new DataFormatter();
		FileInputStream fileIn = null;
		XSSFWorkbook wbook = null;
		String filelocation;

		try {
			filelocation = "./src/test/resources/Excel/Master Module.xlsx";
			fileIn = new FileInputStream(filelocation);
			wbook = (XSSFWorkbook) WorkbookFactory.create(fileIn);
			fileIn.close();
		} catch (Exception e) {
		}
		PropertiesCommonMethods.excalRowCount("Master Module.xlsx", "Material Main Category", "TC-MATMC-0015-01");
		XSSFSheet sheet = wbook.getSheet("Material Main Category");
		int r = PropertiesCommonMethods.countRow - 1;
		row = sheet.getRow(r);
		cell = row.getCell(2);
		String SearchMC = dataValue.formatCellValue(cell);
		row = sheet.getRow(r);
		cell = row.getCell(3);
		String counts = dataValue.formatCellValue(cell);
		row = sheet.getRow(r);
		cell = row.getCell(4);
		String count = dataValue.formatCellValue(cell);
		int mainCategoryTableData = Integer.parseInt(count);
//****************************************************************************************
//          STEP-01--MATERIAL TAB IS DISPLAYED   & STEP-02--MATERIAL TAB IS ENABLED
//****************************************************************************************  
		if (MaterialMainCategoryPage.material.isDisplayed()) {
			testCase = extent.createTest("STEP-01--MATERIAL TAB IS DISPLAYED");
			testCase.log(Status.PASS, "TEST PASS ☑");

			if (MaterialMainCategoryPage.material.isEnabled()) {
				testCase = extent.createTest("STEP-02--MATERIAL TAB IS ENABLED");
				testCase.log(Status.PASS, "TEST PASS ☑");
				MaterialMainCategoryPage.material.click();

			} else {
				testCase = extent.createTest("STEP-02--MATERIAL TAB IS ENABLED");
				testCase.log(Status.PASS, "TEST FAIL ❎");
			}
		} else {
			testCase = extent.createTest("STEP-01--MATERIAL TAB IS DISPLAYED");
			testCase.log(Status.PASS, "TEST FAIL ❎");
		}
//****************************************************************************************
//              STEP-03--MAIN CATEGORY BUTTON IS DISPLAYED &  STEP-04--MAIN CATEGORY BUTTON IS ENABLED
//****************************************************************************************      

		if (MaterialMainCategoryPage.modulemainmaterial.isDisplayed()) {
			testCase = extent.createTest("STEP-03--MAIN CATEGORY BUTTON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST PASS ☑");

			if (MaterialMainCategoryPage.modulemainmaterial.isEnabled()) {
				testCase = extent.createTest("STEP-04--MAIN CATEGORY BUTTON IS ENABLED");
				testCase.log(Status.PASS, "TEST PASS ☑");
				MaterialMainCategoryPage.modulemainmaterial.click();
				Thread.sleep(2000);

			} else {
				testCase = extent.createTest("STEP-04--MAIN CATEGORY BUTTON IS ENABLED");
				testCase.log(Status.PASS, "TEST FAIL ❎");
			}
		} else {
			testCase = extent.createTest("STEP-03--MAIN CATEGORY BUTTON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST FAIL ❎");
		}

//****************************************************************************************
//          STEP-05--MAIN CATEGORY SEARCH ICON IS DISPLAYED & STEP-06--MAIN CATEGORY SEARCH ICON IS ENABLED
//****************************************************************************************  
		if (MaterialMainCategoryPage.maincategorysearchicon.isDisplayed()) {
			testCase = extent.createTest("STEP-05--MAIN CATEGORY SEARCH ICON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST PASS ☑");
			if (MaterialMainCategoryPage.maincategorysearchicon.isEnabled()) {
				testCase = extent.createTest("STEP-06--MAIN CATEGORY SEARCH ICON IS ENABLED");
				testCase.log(Status.PASS, "TEST PASS ☑");
				try {
					MaterialMainCategoryPage.maincategorysearchicon.click();
					Thread.sleep(2000);

				} catch (Exception e) {

				}
			} else {
				testCase = extent.createTest("STEP-06--MAIN CATEGORY SEARCH ICON IS ENABLED");
				testCase.log(Status.PASS, "TEST FAIL ❎");
			}
		} else {
			testCase = extent.createTest("STEP-05--MAIN CATEGORY SEARCH ICON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST FAIL ❎");
		}

//************************************************************************************************************
//          STEP-07--CHECKING MAIN CATEGORY SEARCH TEXTBOX DISPLAYED & STEP-08--CHECKING MAIN CATEGORY SEARCH TEXTBOX ENABLED
//************************************************************************************************************          
		if (MaterialMainCategoryPage.maincategorysearchtextbox.isDisplayed()) {
			testCase = extent.createTest("STEP-07--MAIN CATEGORY SEARCH TEXT BOX IS DISPLAYED");
			testCase.log(Status.PASS, "TEST PASS ☑");
			if (MaterialMainCategoryPage.maincategorysearchtextbox.isEnabled()) {
				testCase = extent.createTest("STEP-08--MAIN CATEGORY SEARCH TEXT BOX IS ENABLED");
				testCase.log(Status.PASS, "TEST PASS ☑");
				try {
					Thread.sleep(2000);
					MaterialMainCategoryPage.maincategorysearchtextbox.sendKeys(SearchMC);
					Thread.sleep(2000);
					MaterialMainCategoryPage.maincategorysearchtextbox.sendKeys(Keys.ENTER);

					Thread.sleep(3000);

				} catch (Exception e) {

				}
			} else {
				testCase = extent.createTest("STEP-08--MAIN CATEGORY SEARCH TEXT BOX IS ENABLED");
				testCase.log(Status.PASS, "TEST FAIL ❎");
			}
		} else {
			testCase = extent.createTest("STEP-07--MAIN CATEGORY SEARCH TEXT BOX IS DISPLAYED");
			testCase.log(Status.PASS, "TEST FAIL ❎");
		}

//************************************************************************************************************
//          STEP-09--CHECKING MAIN CATEGORY SEARCH BUTTON DISPLAYED & STEP-10--CHECKING MAIN CATEGORY SEARCH BUTTON ENABLED
//************************************************************************************************************          

		if (driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).isDisplayed()) {
			testCase = extent.createTest("STEP-09--SEARCH BUTTON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST PASS ☑");
			if (driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).isEnabled()) {
				testCase = extent.createTest("STEP-10--SEARCH BUTTON IS ENABLED");
				testCase.log(Status.PASS, "TEST PASS ☑");
				try {
					driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();
					String MC = driver.findElement(By.xpath(
							"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]/span"))
							.getText();
					System.out.println("MAIN CATEGORY " + MC);
					String TextBox1 = MaterialMainCategoryPage.maincategorysearchtextbox.getAttribute("value");
					System.out.println("text box  " + TextBox1);
				} catch (Exception e) {

				}

			} else {
				testCase = extent.createTest("STEP-10--SEARCH BUTTON IS ENABLED");
				testCase.log(Status.PASS, "TEST FAIL ❎");
			}
		} else {
			testCase = extent.createTest("STEP-09--SEARCH BUTTON IS DISPLAYED");
			testCase.log(Status.PASS, "TEST FAIL ❎");
		}
//*************************************************************************************************************************     

		boolean clickNextPage = true;
		int actualElementCount = 0;
		boolean passorfail = true;
		ArrayList<String> ActualList = new ArrayList<String>();
		ArrayList<String> ExpectedList = new ArrayList<String>();
		String NameXpath_firstPart = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[";
		String NameXpath_lastPart = "]/td[1]";

		while (clickNextPage) {
			for (int i = 2; i < 103; i++) {
				try {
					String textFull = driver.findElement(By.xpath(NameXpath_firstPart + i + NameXpath_lastPart))
							.getText();
					String text = textFull.toLowerCase();
					// System.out.println(text);
					if (!text.contains(SearchMC)) {
						passorfail = false;
					}
					if (text.contains(SearchMC)) {
						ExpectedList.add(text);
					}
					ActualList.add(text);
					actualElementCount = actualElementCount + 1;
				} catch (Exception e) {
				}
			}
			if (clickNextPage == true) {
				clickNextPage = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
						.isEnabled();
				driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
				Thread.sleep(2000);
			} else {
				break;
			}
		}
		Thread.sleep(3000);

//******************************************************************************************************************    
//                                      STEP-10--SINGLE SEARCH CONFIRM
//******************************************************************************************************************    
		try {
			int Value = actualElementCount;
			TestCasePrint("STEP-11--SINGLE SEARCH CONFIRM", counts, String.valueOf(Value));
		} catch (Exception e) {

		}

//		STEP 12 - Material Main Category Single Search Reset Button Properties
		MultiSearchMethods.resetButton(MaterialMainCategoryPage.resetBtn,
				"STEP 12 - Material Main Category Single Search Reset ");

		MaterialMainCategoryPage.mainCateCategorySearch.click();
		Thread.sleep(3000);
//		STEP 13 - Material Main Category Single Search Reset Button Function
		MultiSearchMethods.ButtonClick(MaterialMainCategoryPage.resetBtn,
				"STEP 13 - Material Main Category Single Search Reset", MaterialMainCategoryPage.MainCatColumn,
				mainCategoryTableData);

		MultiSearchMethods.Logout();

	}
}
