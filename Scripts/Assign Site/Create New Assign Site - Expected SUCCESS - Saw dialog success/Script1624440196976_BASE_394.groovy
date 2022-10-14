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

WebUI.click(findTestObject('Assign Site/SidebarMenu_ProjectsManagement'))

WebUI.click(findTestObject('Assign Site/SidebarMenu_Projects'))

WebUI.click(findTestObject('Assign Site/TableProject_ButtonSiteFirstRow'))

WebUI.click(findTestObject('Assign Site/FormAssignSite_ButtonAddProjectSite'))

WebUI.click(findTestObject('Assign Site/FormAssignSite_SelectSite'))

WebUI.setText(findTestObject('Assign Site/FormAssignSite_InputTextSite'), 'Indonesia')

WebUI.sendKeys(findTestObject('Assign Site/FormAssignSite_InputTextSite'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Assign Site/FormAssignSite_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Projects/Assign Site/Page_/div_Save_swal2-success-ring'))

WebUI.click(findTestObject('Assign Site/DialogSuccessCreate_TextSaveSiteProjectSuccess'))

WebUI.click(findTestObject('Assign Site/DialogSuccessCreate_ButtonOk'))

