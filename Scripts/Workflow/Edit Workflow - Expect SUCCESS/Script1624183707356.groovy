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

WebUI.click(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/button_Last Update2021-06-20 005719_btn-def_a616f0'))

isTitlePageEdit = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/h4_Back Workflow Editor'))

assert isTitlePageEdit == true

isTitleEditor = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/h2_Update workflow 12'))

assert isTitlePageEdit == true

WebUI.click(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/button_Save Workflow'))

WebUI.setText(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/input_Title Workflow_title'), 'Workflow Edit')

WebUI.click(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/form_Title WorkflowSave'))

WebUI.click(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/button_Save'))

iconSuccess = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/div_Save_swal2-success-ring'))

assert iconSuccess == true

messageSuccessUpdate = WebUI.getText(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/h2_Workflow updated'))

assert messageSuccessUpdate == 'Workflow updated'

WebUI.click(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/button_Ok'))

isTitleBoxList = WebUI.waitForElementVisible(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/h2_Workflow List'), 
    0)

assert isTitleBoxList == true

isTitlePage = WebUI.waitForElementVisible(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/h4_Workflow'), 0)

assert isTitlePage == true

workflowNameAfterEdit = WebUI.getText(findTestObject('Object Repository/Workflow/Edit Worflow/Page_/td_Workflow Edit'))

assert workflowNameAfterEdit == 'Workflow Edit'

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Ok'))

