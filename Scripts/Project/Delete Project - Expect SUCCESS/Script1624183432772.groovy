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

WebUI.click(findTestObject('Object Repository/Projects/Delete Project/Page_/button_Last Update2021-06-08 050444_btn-def_5f4a76'))

WebUI.click(findTestObject('Object Repository/Projects/Delete Project/Page_/div_'))

projectName = WebUI.getText(findTestObject('Object Repository/Projects/Delete Project/Page_/b_PRJ0013 - test project I'))

messageQuestion = WebUI.getText(findTestObject('Object Repository/Projects/Delete Project/Page_/h2_Are You Sure'))

messageQuestion == 'Are You Sure ?'

messageConfirmationDelete = WebUI.verifyElementVisible(findTestObject('Projects/Delete Project/Page_/div_Do you really want to delete PRJ0013 - _835473'))

messageConfirmationDelete == true

isButtonCancel = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Delete Project/Page_/button_Cancel'))

isButtonCancel == true

WebUI.click(findTestObject('Object Repository/Projects/Delete Project/Page_/button_Yes'))

iconSuccessDelete = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Delete Project/Page_/div_www.lifewood.com_swal2-success-ring'))

iconSuccessDelete == true

messageAlertSuccessDelete = WebUI.getText(findTestObject('Object Repository/Projects/Delete Project/Page_/h2_Project deleted'))

messageAlertSuccessDelete == 'Project deleted'

WebUI.click(findTestObject('Object Repository/Projects/Delete Project/Page_/button_OK'))

