package com.qa.automation.qdms.testcases.master;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.pages.master.MasterPage;

public class MasterTest extends DriverIntialization {

	static MasterPage master = new MasterPage();

	@Test

	public static void MasterCard() throws InterruptedException {

		PageFactory.initElements(driver, master);
		Thread.sleep(2000);
		MasterPage.masterBtn.click();
	}

}
