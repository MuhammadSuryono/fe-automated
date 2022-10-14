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

WebUI.click(findTestObject('Site/Site Page/SitePage_ButtonAddSite'))

'get site name value\r\n'
WebUI.setText(findTestObject('Page_/input_Site Name_site_name'), siteName)

'fill status'
status = WebUI.getText(findTestObject('Site Page/Page_/div_Status Choose Status'))

if (status == '') {
    isSiteNameFilled = true
}

assert isSiteNameFilled

assert isStatusFilled == false

'Klik Save'
WebUI.click(findTestObject('User/FormUser_ButtonSave'))

//siteNameErrorObject = findTestObject('Site Page/Page_/error site name required')
statusErrorObject = findTestObject('Site Page/Page_/error status required')

//WebUI.waitForElementVisible(siteNameErrorObject, 30)
'Waiting for element visible'
WebUI.waitForElementVisible(statusErrorObject, 30)

//siteNameError = WebUI.getText(siteNameErrorObject)
statusError = WebUI.getText(statusErrorObject)

//assert siteNameError == 'Site Name is Required!'
assert statusError == 'Status value only allowed!'

WebUI.click(findTestObject('Site Page/Page_/button_Close'))

