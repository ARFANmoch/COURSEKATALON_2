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



class masuk {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to login page")
	def userNavigateToLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://lifechangers.org/')
	}

	@When("Click Button Login and Registrasi")
	def clickButtonLoginAndRegister() {
		WebUI.click(findTestObject('Object Repository/Page_Lifechangers  Carrying Agape Reformation to the Nations/a_Login  Register'))
	}

	@And("Enter (.*) and (.*)")
	def enterCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_My Account  Lifechangers/input__username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  Lifechangers/input__password'), password)
	}

	@And("Click Button login")
	def clickButtonLogin() {
		WebUI.click(findTestObject('Object Repository/Page_My Account  Lifechangers/input__login'))
	}

	@Then("User navigate to homepage")
	def userNavigateToHompage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account  Lifechangers/strong_mcharfnn'), 20)
		WebUI.closeBrowser()
	}
}