import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
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

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Add Workflow'))

titleBox = WebUI.getText(findTestObject('Workflow/Create Duplicate/h2_Create new workflow'))

assert titleBox == 'Create new workflow'

titlePage = WebUI.verifyElementVisible(findTestObject('Workflow/Create Duplicate/h4_Back Workflow Editor'))

assert titlePage == true

WebUI.click(findTestObject('Workflow/Create Duplicate/div_Import Error Details_entry bpmn-icon-se_c03cf6'))

WebUI.click(findTestObject('Workflow/Create Duplicate/body_LiFT RevampWelcome,HusnanAs Administra_5dee58'))

WebUI.click(findTestObject('Workflow/Create Duplicate/a_Check Path Not Duplicate'))

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Save Workflow'))

WebUI.setText(findTestObject('Workflow/Create Duplicate/input_Title Workflow_title'), 'Workflow')

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Save'))

messageAlert = WebUI.getText(findTestObject('Workflow/Create Duplicate/h2_Workflow Created'))

Pattern regex = Pattern.compile('(:?s|Already|Exists)')

Matcher match = regex.matcher(messageAlert)

assert match.find() == true

WebUI.click(findTestObject('Workflow/Create Duplicate/button_Ok'))

