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

WebUI.click(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/button_Add Project'))

WebUI.click(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/button_Save'))

projectNameRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_Project Name is Required'))

assert projectNameRequired == true

projectManagerRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_Project Manager only number allowed'))

assert projectManagerRequired == true

workflowRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_Workflow only number allowed'))

assert workflowRequired == true

startDateRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_Start Date is Required'))

assert startDateRequired == true

endDateRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_End Data is Required'))

assert endDateRequired == true

statusRequired = WebUI.verifyElementVisible(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/small_Status value only allowed'))

assert statusRequired == true

WebUI.click(findTestObject('Object Repository/Projects/Validation Empty Field/Page_/span_'))

