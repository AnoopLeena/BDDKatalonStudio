import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.internal.FindsByXPath
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {

	@Given ("User navigates to login page")

	def navigateToLoginPage() {
		try {
			println ("\n I am inside navigate to login page")
			WebUI.openBrowser('')
			WebUI.maximizeWindow()
			WebUI.navigateToUrl('https://www.saucedemo.com/')
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@When ("User enter (.*) and (.*)")
	def enterTheCredentials(String username, String password) {
		try {
			println("\n I am inside enterTheCredentials")
			String img = WebUI.verifyImagePresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/div_standard_userlocked_out_userproblem_userperformance_glitch_user_login_logo') )
			println img
			WebUI.setText(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), username)
			WebUI.setEncryptedText(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'),
					password)
			WebUI.verifyElementPresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/div_standard_userlocked_out_userproblem_userperformance_glitch_user_login_logo'), '')
			String Actual = "Username"
			String Expected = WebUI.getAttribute(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), 'placeholder')
			println Expected
			WebUI.verifyEqual(Actual, Expected)
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@And ("Click login button")
	def clickLogin() {
		try {
			println("\n I am inside clickLogin")
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then ("User is navigate to home page")
	def VerifyHomepage() {
		try {
			println("\n I am inside the Verify home page")
			WebUI.verifyElementPresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/div_Close Menu_app_logo'), 4)
			String Home_img = WebUI.verifyImagePresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/div_Close Menu_app_logo') )
			println Home_img
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And ("User  filter the product")
	def FilterTheProduct() {
		try {

			println("\n I am inside filter the product")

			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A_3f2346'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A_3f2346'))
			WebUI.selectOptionByValue(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'),
					'lohi', false)
			WebUI.verifyElementPresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/span_Products'), '')
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	@And ("Selected the three products and cart it")
	def Add2Cart() {
		try {
			println("\n I am inside Add to cart")
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Add to cart'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Add to cart_1'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Add to cart (1)'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/a_2'))
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@And ("Remove one Product from cart")
	def RemoveCart() {
		try {
			println("\n I am inside Add to cart")
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Remove'))
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then ("Proceed to check out")
	def Checkout() {
		try {
			println("\n I am inside Checkout")
			//	WebUI.verifyElementPresent(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/span_Your Cart'), '')
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Checkout'))

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}



	@And ("Enter the User (.*) and (.*) and (.*)")
	def UserInfomation(String FirstName, String LastName, String PostalCode) {

		try {
			println("\n I am inside User Information")
			WebUI.setText(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_Checkout Your Information_firstName'), FirstName)
			WebUI.setText(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_Checkout Your Information_lastName'), LastName)
			WebUI.setText(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_Checkout Your Information_postalCode'), PostalCode)
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/input_Cancel_continue'))
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@And ("Finish")
	def finish() {

		try {
			println("\n I am inside the finish")
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Finish'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Back Home'))
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Then ("Logout")
	def Logout() {
		try {
			println("\n Iam Inside the Logout")
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/button_Open Menu'))
			WebUI.click(findTestObject('Object Repository/BDD_Flow/Page_Swag Labs/a_Logout'))
			WebUI.closeBrowser()
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

