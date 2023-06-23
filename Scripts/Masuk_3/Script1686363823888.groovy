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

for (int i = 0; i < 2; i++) {
for (def rowNum=1; rowNum <=2; rowNum++) 
	WebUI.navigateToUrl('https://lifechangers.org/')

	WebUI.click(findTestObject('Object Repository/Page_Lifechangers  Carrying Agape Reformation to the Nations/a_Login  Register'))

	for (def rowNum=1; rowNum <=findTestData("Life/LiseUser").getRowNumbers(); rowNum++) {
	WebUI.setText(findTestObject('Object Repository/Page_My Account  Lifechangers/input__username'), findTestData("Life/LiseUser").getValue(1,rowNum))

	WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  Lifechangers/input__password'), findTestData("Life/LiseUser").getValue(2,rowNum))
	Thread.sleep(3000)
	}	
	WebUI.click(findTestObject('Object Repository/Page_My Account  Lifechangers/input__login'))

	WebUI.click(findTestObject('Object Repository/Page_My Account  Lifechangers/a_Sign out'))

	WebUI.click(findTestObject('Object Repository/Page_My Account  Lifechangers/a_Confirm and log out'))

}

WebUI.closeBrowser()
