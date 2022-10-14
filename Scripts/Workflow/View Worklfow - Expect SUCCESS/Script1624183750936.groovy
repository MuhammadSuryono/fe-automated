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

WebUI.click(findTestObject('Workflow/Create Duplicate/a_Projects Management'))

WebUI.click(findTestObject('Workflow/Create Duplicate/a_Workflow'))

workflowName = WebUI.getText(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Workflow/View Workflow/Page_/button_Last Update2021-06-19 095508_btn-def_f22c9a'))

isTitlePage = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/View Workflow/Page_/h4_Back View Workflow 10 - Workflow Coffee'))

assert isTitlePage == true

titleBoxEditor = WebUI.getText(findTestObject('Object Repository/Workflow/View Workflow/Page_/h2_Workflow List'))

assert titleBoxEditor == 'View Workflow'

isComponentWorfklow = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/View Workflow/Page_/div_xml version1.0 encodingUTF-8bpmndefinit_b16f4b'))

assert isComponentWorkflow == true

