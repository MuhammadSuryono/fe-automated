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

isExpandedUserManagement = WebUI.waitForElementVisible(findTestObject('Role/SidebarMenu_Role'), 1)

if (!(isExpandedUserManagement)) {
    WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManagement'))
}

WebUI.click(findTestObject('Role/SidebarMenu_UserManagement'))

WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManager'))

'click button add site manager'
WebUI.click(findTestObject('Site Manager/Page_/Page_ButtonAddSiteManager'))

titleAdd = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Page_TitleSiteManager'), 30)

assert titleAdd

WebUI.click(findTestObject('Site Manager/Page_/FormSiteManager_SelectSite'))

WebUI.setText(findTestObject('Site Manager/Page_/FormSiteManager_InputTextSite'), siteName)

WebUI.sendKeys(findTestObject('Site Manager/Page_/FormSiteManager_InputTextSite'), Keys.chord(Keys.TAB))

String[] split = manager.split(',')

int splitLength = split.size()

WebUI.click(findTestObject('Site Manager/Page_/FormSiteManager_SelectManager'))

for (int i = 0; i < splitLength; i++) {
    WebUI.setText(findTestObject('Site Manager/Page_/FormSiteManager_InputTextManager'), split[i])

    WebUI.sendKeys(findTestObject('Site Manager/Page_/FormSiteManager_InputTextManager'), Keys.chord(Keys.TAB))
}

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/button_Save'))

swalIconSuccess = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_IconSuccess'), 3)

swallTextSuccess = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_TextSuccess'), 3)

assert swalIconSuccess && swallTextSuccess

WebUI.click(findTestObject('Site Manager/Page_/Dialog_ButtonOk'))

