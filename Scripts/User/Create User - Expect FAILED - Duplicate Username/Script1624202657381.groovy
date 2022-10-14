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

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/button_Add New User'))

WebUI.setText(findTestObject('Object Repository/User/Create User Duplicate/Page_/input_Fullname_fullname'), 'Linda21')

WebUI.setText(findTestObject('Object Repository/User/Create User Duplicate/Page_/input_Username_username'), 'linda21')

WebUI.setText(findTestObject('Object Repository/User/Create User Duplicate/Page_/input_Email_email'), 'linda21@lifewood.dev')

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/div_option RLE0033 - Test Role site creator_e13b8e'))

WebUI.setText(findTestObject('User/FormUser_InputTextRole'), 'File Manager')

WebUI.sendKeys(findTestObject('User/FormUser_InputTextRole'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/User/Create User Duplicate/Page_/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Create User Duplicate/Page_/input_Confirm Password_confirmation_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/div_option - Choose Status - focused, 1 of _2c91fe'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/div_Active'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/span_Save_swal2-x-mark'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/h2_Username is already exists'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/button_OK'))

WebUI.click(findTestObject('Object Repository/User/Create User Duplicate/Page_/span_'))

WebUI.closeBrowser()

