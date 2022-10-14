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

WebUI.navigateToUrl('https://revamp.lifewood.dev/app/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Lift Revamp_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_/span_Projects Management_fa fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_/a_Projects'))

WebUI.click(findTestObject('Object Repository/Page_/a_Projects'))

WebUI.click(findTestObject('Object Repository/Page_/button_Last Update2021-06-08 200440_btn-def_8e7a2e'))

WebUI.click(findTestObject('Object Repository/Page_/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_/button_OK'))

WebUI.closeBrowser()

