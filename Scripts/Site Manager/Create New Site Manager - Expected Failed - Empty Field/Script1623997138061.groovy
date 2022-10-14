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

WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManagement'))

WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManager'))

'click button add site manager'
WebUI.click(findTestObject('Site Manager/Page_/Page_ButtonAddSiteManager'))

titleAdd = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Page_TitleSiteManager'), 30)

assert titleAdd

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/button_Save'))

siteErrorMessage = findTestObject('Site Manager/Page_/site message error')
WebUI.waitForElementVisible(siteErrorMessage, 30)

hasClassError = WebUI.verifyElementAttributeValue(siteErrorMessage, 'class', 'text-danger font-weight-bold', 30)
assert hasClassError

verifyText = WebUI.verifyElementText(siteErrorMessage, 'Site only number allowed!')
assert verifyText

managerErrorMessage = findTestObject('Site Manager/Page_/manager error')
WebUI.waitForElementVisible(managerErrorMessage, 30)

hasClassManagerError = WebUI.verifyElementAttributeValue(managerErrorMessage, 'class', 'text-danger font-weight-bold', 30)
assert hasClassManagerError

verifyTextManager = WebUI.verifyElementText(siteErrorMessage, 'Site only number allowed!')
assert verifyTextManager

WebUI.closeBrowser()

