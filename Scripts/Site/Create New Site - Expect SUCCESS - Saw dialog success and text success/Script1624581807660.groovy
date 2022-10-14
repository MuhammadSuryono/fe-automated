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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

isExpandedProjectsManagement = WebUI.waitForElementVisible(findTestObject('Site/Sidebar Menu/SidebarMenu_Site'), 1)

if (!(isExpandedProjectsManagement)) {
    WebUI.click(findTestObject('Site/Sidebar Menu/SidebarMenu_SiteManagement'))
}

WebUI.click(findTestObject('Site/Sidebar Menu/SidebarMenu_Site'))

WebUI.click(findTestObject('Site/Site Page/SitePage_ButtonAddSite'))

WebUI.setText(findTestObject('Site/Form Site/FormSite_TextInputSiteName'), siteName)

WebUI.click(findTestObject('Site/Form Site/FormSite_SelectStatus'))

WebUI.setText(findTestObject('Site/Form Site/FormSite_TextInputStatus'), status)

WebUI.sendKeys(findTestObject('Site/Form Site/FormSite_TextInputStatus'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Site/Form Site/FormSite_ButtonSave'))

'success dialog'
isSuccessIcon = WebUI.verifyElementVisible(findTestObject('Site/Dialog Success Create/DialogSuccessCreate_IconSuccess'))

isSuccessText = WebUI.verifyElementVisible(findTestObject('Site/Dialog Success Create/DialogSuccessCreate_TextSiteCreated'))

assert isSuccessIcon && isSuccessText

'Klik Dialog OK'
WebUI.click(findTestObject('Site/Dialog Success Create/DialogSuccessCreate_ButtonOk'))

WebUI.waitForPageLoad(3)

