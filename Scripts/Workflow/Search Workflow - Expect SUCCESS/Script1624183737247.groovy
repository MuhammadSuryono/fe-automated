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

WebUI.click(findTestObject('Object Repository/Workflow/Filter Workflow/Page_/button_Filter Workflow_collapse-link text-s_20c2c0'))

WebUI.setText(findTestObject('Object Repository/Workflow/Filter Workflow/Page_/input_Title_form-control'), 'Workflow Coffee')

WebUI.click(findTestObject('Object Repository/Workflow/Filter Workflow/Page_/button_Filter'))

WebUI.delay(2)

resultSearch = WebUI.getText(findTestObject('Object Repository/Workflow/Filter Workflow/Page_/td_Workflow Coffee'))

assert resultSearch == 'Workflow Coffee'

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Workflow/Filter Workflow/Page_/button_Filter Workflow_collapse-link text-s_20c2c0'))

