package com.qa.extent.report;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");

	@Test
	public void f1() {

		ExtentTest test = extent.createTest("Launch Browser and Website");
		test.log(Status.PASS, "User Launch website");
		test.pass("User Launch website verified");

	}

	@Test
	public void f2() {

		ExtentTest test = extent.createTest("Verify Login");
		test.log(Status.PASS, "Login Screen");
		test.pass("Login Page Verified");

	}

	@Test
	public void f3() {

		ExtentTest test = extent.createTest(" Login DashBoard Sucessfully");
		test.log(Status.PASS, "DashBoard Screen");
		test.pass("Dash Board Verified");

	}

	@Test
	public void f4() {

		ExtentTest test = extent.createTest("Logout");
		test.log(Status.PASS, "Logout Screen");
		test.pass("LogoutVerified");

	}

	@BeforeTest
	public void beforeTest() {

		extent.attachReporter(spark);

	}

	@AfterTest
	public void afterTest() {

		extent.flush();

	}

}
