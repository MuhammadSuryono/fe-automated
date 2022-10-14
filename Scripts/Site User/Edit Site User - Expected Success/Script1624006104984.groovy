import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.text.SimpleDateFormat

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

WebUI.callTestCase(findTestCase('Login/Login Sucess'), [('hasErrorMessage') : false, ('seeProfilePicture') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_/a_Site Management'))

WebUI.click(findTestObject('Page_/a_Site User'))

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 10)

WebUI.click(findTestObject('null'))

getUserValue = WebUI.getText(editSelectedValue)

WebUI.click(editSelectedValue)


WebUI.click(findTestObject('User/FormUser_ButtonSave'))

isSuccessIcon = WebUI.waitForElementVisible(findTestObject('null'), 10)

isSuccessText = WebUI.waitForElementVisible(findTestObject('null'), 
    10)

assert isSuccessIcon && isSuccessText

WebUI.click(findTestObject('Page_/button_OK'))

tableValueObject = findTestObject('null')
WebUI.waitForElementVisible(findTestObject('null'), 10)

getTableValue = WebUI.getText(tableValueObject)

assert getUserValue == getTableValue


createdAt = WebUI.getText(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
String [] splitCreatedAt = createdAt.split(': ')

updatedAt = WebUI.getText(findTestObject('null'))
String [] splitUpdatedAt = createdAt.split(': ')

SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date created = format.parse(createdAt[1])
Date updated = format.parse(updatedAt[1])

System.out.println(created.compareTo(updated))

assert created.compareTo(updated) > 0


