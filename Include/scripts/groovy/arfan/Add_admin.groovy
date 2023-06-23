package arfan
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



class Add_admin {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login OrangeHRM")
	def userNavigateToLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')
	}

	@When("Masukan (.*) Dan (.*)")
	def enterCredentials(String Username, String Password) {
		WebUI.setText(findTestObject('Object Repository/feature.admin/Page_OrangeHRM/input_Username_username'), Username)
		WebUI.setEncryptedText(findTestObject('Object Repository/feature.admin/Page_OrangeHRM/input_Password_password'), Password)
	}

	@And("Klik button login")
	def ClickbtonLogin() {
		WebUI.click(findTestObject('Object Repository/feature.admin/Page_OrangeHRM/button_Login'))
	}

	@Given("User navigate to Admin Page")
	def userNavigateToHompage() {
		WebUI.click(findTestObject('Object Repository/User Role/Page_OrangeHRM/div_Admin'))
	}

	@When("click Button Add")
	def ClickButtonAdd() {
		WebUI.click(findTestObject('Object Repository/Page_1686274274080/button_Add'))
	}

	@And("User Select User Role")
	def UserSelectRole() {
		WebUI.click(findTestObject('Object Repository/User Role/Page_OrangeHRM/div_-- Select --'))
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Admin'))
	}

	@And("User Select Status")
	def UserSelectStatus() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Enabled'))
	}

	@And("User Enter Employee Name")
	def EnterEmployee() {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'Odis Adalwin')
		WebUI.click(findTestObject('Object Repository/Page_1686274274080/span_Paul  Collings'))
	}

	@And("User Enter Username, Password And Confirm Password")
	def EnterUsernameAndPasswor() {
		WebUI.setText(findTestObject('Object Repository/Page_1686274274080/input_Username_oxd-input oxd-input--focus'), 'Arfan029')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_1686274274080/input_Password_oxd-input oxd-input--focus'), '9knpEPYpaHtt3qMxdX6vcg==')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_1686274274080/input_Confirm Password_oxd-input oxd-input--focus'), '9knpEPYpaHtt3qMxdX6vcg==')
	}

	@When("User Click Button Save")
	def ClickButtonSave() {
		WebUI.click(findTestObject('Object Repository/Page_1686274274080/button_Save'))
	}

	@Then("User Navigate To User Management")
	def NavigateToUserManagement() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 7)
		WebUI.closeBrowser()
	}
}