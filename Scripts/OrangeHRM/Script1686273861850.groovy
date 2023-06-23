import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')
WebUI.setText(findTestObject('Object Repository/POPUPS/Page_OrangeHRM/input_Username_username'), 'Admin')
WebUI.setEncryptedText(findTestObject('Object Repository/POPUPS/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
WebUI.click(findTestObject('Object Repository/feature.admin/Page_OrangeHRM/button_Login'))
WebUI.click(findTestObject('Object Repository/User Role/Page_OrangeHRM/div_Admin'))
WebUI.click(findTestObject('Object Repository/Page_1686274274080/button_Add'))
WebUI.click(findTestObject('Object Repository/User Role/Page_OrangeHRM/div_-- Select --'))
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Admin'))
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Enabled'))
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'David Morris')
WebUI.click(findTestObject('Object Repository/Page_1686274274080/span_Paul  Collings'))
WebUI.setText(findTestObject('Object Repository/Page_1686274274080/input_Username_oxd-input oxd-input--focus'), 'Arfan32')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_1686274274080/input_Password_oxd-input oxd-input--focus'), 'SlZLWrA+nuLYvaUvUosYAQ==')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_1686274274080/input_Confirm Password_oxd-input oxd-input--focus'), 'SlZLWrA+nuLYvaUvUosYAQ==')
WebUI.click(findTestObject('Object Repository/Page_1686274274080/button_Save'))
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_SuccessSuccessfully Saved'))
WebUI.waitForAlert(5)
WebUI.delay(1)
WebUI.closeBrowser()