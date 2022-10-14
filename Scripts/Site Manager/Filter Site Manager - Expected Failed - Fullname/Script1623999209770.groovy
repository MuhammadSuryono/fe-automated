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

WebUI.callTestCase(findTestCase('Login/Login Sucess'), [('hasErrorMessage') : false, ('seeProfilePicture') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManagement'))

WebUI.click(findTestObject('Site Manager/Page_/SidebarMenu_SiteManager'))

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/div_Filter Site Manager_clearfix'))

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/div_Choose User'))

objectSelectedFullname = findTestObject('Object Repository/Site Manager/Page_/div_USR0105 - Dian')
WebUI.click(objectSelectedFullname)

getText = WebUI.getText(objectSelectedFullname)
String [] split = getText.split("- ")

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/button_Filter'))

verifyShowInTable = WebUI.verifyElementText(findTestObject('Object Repository/Site Manager/Page_/td_Dian'), split[1])
assert verifyShowInTable
