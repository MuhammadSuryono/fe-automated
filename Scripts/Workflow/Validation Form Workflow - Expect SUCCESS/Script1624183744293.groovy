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

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Add Workflow'))

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Save Workflow'))

WebUI.click(findTestObject('Workflow/Create Duplicate/input_Title Workflow_title'))

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Save'))

isTitleRequired = WebUI.verifyElementVisible(findTestObject('Workflow/Create Duplicate/small_Title Workflow is Required'))

assert isTitleRequired == true

WebUI.click(findTestObject('Workflow/Create Duplicate/span_'))

