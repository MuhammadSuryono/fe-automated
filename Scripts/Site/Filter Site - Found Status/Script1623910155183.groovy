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

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Filter Site_clearfix'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Choose Status'))

'Filter active'
WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Active'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Filter'))

active = findTestObject('Object Repository/Site Page/Page_/span_ACTIVE')

assert WebUI.getText(active).toLowerCase() == 'active'

WebUI.verifyElementAttributeValue(active, 'class', 'badge badge-success', 3)

'Filter non active'
WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Active_1'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Not Active'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Filter'))

nonActive = findTestObject('Object Repository/Site Page/Page_/span_ACTIVE')

assert WebUI.getText(active).toLowerCase() == 'non active'

WebUI.verifyElementAttributeValue(active, 'class', 'badge badge-danger', 3)

WebUI.closeBrowser()

