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

isExpandedSiteManagement = WebUI.waitForElementVisible(findTestObject('Site User/SidebarMenu_SiteUser'), 1)

if (!(isExpandedSiteManagement)) {
    WebUI.click(findTestObject('Site User/SidebarMenu_SiteManagement'))
}

WebUI.click(findTestObject('Site User/SidebarMenu_SiteUser'))

WebUI.click(findTestObject('Site User/PageSiteUser_ButtonAddSiteUser'))

WebUI.click(findTestObject('Site User/FormSiteUser_SelectSite'))

WebUI.setText(findTestObject('Site User/FormSiteUser_InputTextSite'), siteName)

WebUI.sendKeys(findTestObject('Site User/FormSiteUser_InputTextSite'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Site User/FormSiteUser_SelectUser'))

WebUI.setText(findTestObject('Site User/FormSiteUser_InputTextUser'), user)

WebUI.sendKeys(findTestObject('Site User/FormSiteUser_InputTextUser'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Site User/FormSiteUser_SelectModule'))

WebUI.setText(findTestObject('Site User/FormSiteUser_InputTextModule'), moduleName)

WebUI.sendKeys(findTestObject('Site User/FormSiteUser_InputTextModule'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Site User/FormSiteUser_ButtonSave'))

isSuccessText = WebUI.verifyElementVisible(findTestObject('Site User/DialogSuccessCrerate_TextSuccessCreate'))

assert isSuccessText == true

WebUI.click(findTestObject('Site User/DilogSuccessCreate_ButtonOk'))

