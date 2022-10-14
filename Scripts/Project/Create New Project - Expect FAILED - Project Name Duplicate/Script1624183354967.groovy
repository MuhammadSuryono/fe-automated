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

WebUI.click(findTestObject('Projects/ProjectPage_ButtonAddProject'))

WebUI.setText(findTestObject('Projects/FormProject_InputTextProjectName'), projectName)

WebUI.click(findTestObject('Projects/FormProject_SelectProjectManager -'))

WebUI.setText(findTestObject('Projects/FormProject_InputTextProjectManager'), 
    'PM1')

WebUI.sendKeys(findTestObject('Projects/FormProject_InputTextProjectManager'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Projects/FormProject_SelectWorkflow'))

WebUI.setText(findTestObject('Projects/FormProject_InputTextWorkflow'), 'Workflow')

WebUI.sendKeys(findTestObject('Projects/FormProject_InputTextWorkflow'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Projects/FormProject_InputDateStartDate'))

WebUI.click(findTestObject('Object Repository/Projects/Create Project/Page_/div_1'))

WebUI.click(findTestObject('Projects/FormProject_InputDateStartDate'))

WebUI.click(findTestObject('Object Repository/Projects/Create Project/Page_/div_30'))

WebUI.click(findTestObject('Projects/Create Project/div_option Choose Status focused, 1 of 3. 3_c5c329'))

WebUI.click(findTestObject('Object Repository/Projects/Create Project/Page_/div_Active'))

WebUI.click(findTestObject('Projects/FormProject_ButtonSave'))

messageSuccessCreateProjectDuplicate = WebUI.getText(findTestObject('Projects/DialogSuccessCreate_TextSuccessCreateProject'))

assert messageSuccessCreateProjectDuplicate == 'Success create project'

iconSuccessCreateNotVisible = WebUI.verifyElementNotVisible(findTestObject('Projects/DialogSuccessCreate_IconSuccess'))

assert iconSuccessCreateNotVisible == true

WebUI.click(findTestObject('null'))

