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

WebUI.click(findTestObject('Object Repository/Workflow/Page_/a_Projects Management'))

WebUI.click(findTestObject('Object Repository/Workflow/Page_/a_Workflow'))

WebUI.click(findTestObject('Object Repository/Workflow/Page_/i_Last Update2021-06-22 144741_fa fa-fw fa-trash-o'))

iconQuestion = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_'))

assert iconQuestion == true : 'Icon question'

titleQuestion = WebUI.getText(findTestObject('Dictionary Content Delete/h2_Are You Sure'))

assert titleQuestion == 'Are You Sure ?'

commentBeforeDelete = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_Do you really want to delete 41474 - Ca_7d4239'))

assert commentBeforeDelete == true

WebUI.click(findTestObject('Object Repository/Workflow/Page_/button_Yes'))

successText = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Page_/h2_workflow deleted'))

successIcon = WebUI.verifyElementVisible(findTestObject('Workflow/Create Duplicate/Page_/div_Save_swal2-success-ring'))

assert successText && successIcon

WebUI.click(findTestObject('Workflow/DialogSuccessCreate_ButtonOk'))

