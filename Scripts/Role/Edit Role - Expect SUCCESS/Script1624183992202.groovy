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

WebUI.click(findTestObject('Object Repository/Role/Role Edit Success/Page_/button_Last Update2021-06-19 112516_btn-def_d61a2e'))

WebUI.setText(findTestObject('Object Repository/Role/Role Edit Success/Page_/input_Role Name_name'), 'User Creator Edit')

WebUI.click(findTestObject('Object Repository/Role/Role Edit Success/Page_/button_Save'))

isSuccess = WebUI.verifyElementVisible(findTestObject('Object Repository/Role/Role Edit Success/Page_/div_www.lifewood.com_swal2-success-ring'))

assert isSuccess == true

isMessageUpdateSuccess = WebUI.verifyElementVisible(findTestObject('Object Repository/Role/Role Edit Success/Page_/h2_Role updated'))

assert isMessageUpdateSuccess == true

WebUI.click(findTestObject('Object Repository/Role/Role Edit Success/Page_/button_OK'))

rowTableColumnNameEdit = WebUI.getText(findTestObject('Object Repository/Role/Role Edit Success/Page_/td_RLE0036 - User Creator Edit'))

String[] arrOfRowTable = rowTableColumnNameEdit.split("-")

assert arrOfRowTable[1] == ' User Creator Edit'

