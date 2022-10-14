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

WebUI.click(findTestObject('Site User/SidebarMenu_SiteManagement'))

WebUI.click(findTestObject('Site User/SidebarMenu_SiteUser'))

tableUserValueObject = findTestObject('null')
getTableUserValueBeforeDelete = WebUI.getText(tableUserValueObject)

verifyDeleteButton = WebUI.verifyElementAttributeValue(findTestObject('null'), 'class', 'fa fa-fw fa-trash-o', 
    0)

assert verifyDeleteButton

WebUI.click(findTestObject('null'))

swalTextTitleQuestion = WebUI.waitForElementVisible(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)

swalIconQuestion = WebUI.waitForElementVisible(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)

swalTextQuestion = WebUI.waitForElementVisible(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)

assert swalIconQuestion && swalTextQuestion && swalTextTitleQuestion

WebUI.click(findTestObject('null'))

swalSuccessIcon = WebUI.waitForElementVisible(findTestObject('null'), 10)

swalSuccessText = WebUI.waitForElementVisible(findTestObject('null'), 
    10)

assert swalSuccessIcon && swalSuccessText

WebUI.click(findTestObject('Site User/DilogSuccessCreate_ButtonOk'))

getTableUserValueAfterDelete = WebUI.getText(tableUserValueObject)
assert getTableUserValueBeforeDelete != getTableUserValueAfterDelete

