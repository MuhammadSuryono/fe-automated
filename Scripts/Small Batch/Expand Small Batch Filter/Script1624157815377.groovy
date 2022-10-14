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

WebUI.setText(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/input_Lift Revamp_username'), 
    'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/input_Lift Revamp_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/button_Log in'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/a_File Management'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/a_Batch'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/button_10 Small Batch'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/button_Filter Small Batches_collapse-link t_31d8c5'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/div_Small BatchFilterStatus- Choose Status -'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/li'))

WebUI.click(findTestObject('Object Repository/File Management/Expand Small Batch Filter/Page_/li'))

WebUI.closeBrowser()

