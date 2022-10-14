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

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_File Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_1 Site Manager'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Add Assign Manager'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/div_- Choose User Manager -'))

userManagerValue = WebUI.getText(userManager)

WebUI.click(userManager)

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_Save'))

swalSuccessIcon = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_IconSuccess'), 10)

swalSuccessText = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/Dialog_TextSuccess'), 10)

assert swalSuccessIcon && swalSuccessText

WebUI.click(findTestObject('Object Repository/Site Page/Page_/button_OK'))

userTableValue = WebUI.getText(findTestObject('Site Page/Page_/td'))

userTableValue == userManagerValue

created = WebUI.getText(createdAt)
String [] splitCreatedAt = created.split(': ')

updated = WebUI.getText(updatedAt)
String [] splitUpdatedAt = updated.split(': ')

assert splitCreatedAt[1] == splitUpdatedAt[1]

