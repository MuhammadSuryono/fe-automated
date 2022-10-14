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

WebUI.callTestCase(findTestCase('Login/Login Sucess'), [('hasErrorMessage') : false, ('seeProfilePicture') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_2 Site Manager'))

WebUI.verifyElementVisible(successStatus)

hasClassSuccess = WebUI.verifyElementAttributeValue(successStatus, 'class', 'badge badge-success', 10)

assert hasClassSuccess

'button edit'
WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Last Update2021-06-18 205152_btn-def_d11355'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Active'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_Non Active'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Save'))

swalSuccessIcon = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_IconSuccess'), 10)

swalSuccessText = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_TextSuccess'), 10)

assert swalSuccessIcon && swalSuccessText

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Site Page/Page_/span_NOT ACTIVE'))

hasClassNotActive = WebUI.verifyElementAttributeValue(notActive, 'class', 'badge badge-danger', 0)
assert hasClassNotActive

assert WebUI.getText(notActive) == 'NOT ACTIVE'


