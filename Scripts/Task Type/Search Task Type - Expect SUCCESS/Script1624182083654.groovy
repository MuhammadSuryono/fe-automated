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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://revamp.lifewood.dev/app/auth/login')

WebUI.setText(findTestObject('Object Repository/Task Type/Search Task type/Page_/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Object Repository/Task Type/Search Task type/Page_/input_Lift Revamp_password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Task Type/Search Task type/Page_/input_Lift Revamp_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/a_System'))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/a_Task Type'))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/div_Filter Task Type_clearfix'))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/button_Filter Task Type_collapse-link text-_8db17c'))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/button_Filter Task Type_collapse-link text-_8db17c'))

WebUI.setText(findTestObject('Object Repository/Task Type/Search Task type/Page_/input_Task Name_filter-form form-control fo_8f7b6f'), 
    'Data Entry')

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/button_Filter'))

WebUI.click(findTestObject('Object Repository/Task Type/Search Task type/Page_/span_TTP0021 - Data Entry'))

WebUI.closeBrowser()

