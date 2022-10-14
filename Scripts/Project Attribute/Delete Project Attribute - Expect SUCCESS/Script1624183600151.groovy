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

WebUI.click(findTestObject('Page_/a_Project Attribute'))

WebUI.click(findTestObject('Object Repository/Page_/button delete project attribute'))

iconQuestion = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_'))

assert iconQuestion == true : 'Icon question'

titleQuestion = WebUI.getText(findTestObject('Dictionary Content Delete/h2_Are You Sure'))

assert titleQuestion == 'Are You Sure ?'

commentBeforeDelete = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_Do you really want to delete 41474 - Ca_7d4239'))

assert commentBeforeDelete == true

WebUI.click(findTestObject('Page_/button_Yes_delete_project_attribute'))

messageSuccess = WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/h2_Success delete Project Attribute'))

assert messageSuccess == true : 'success delete project attribute'

WebUI.click(findTestObject('Page_/button_OK'))

successRemoveFromTable = WebUI.getText(findTestObject('Page_/table row project attribute index 1'))

assert successRemoveFromTable == attributeName : 'success remove data'

