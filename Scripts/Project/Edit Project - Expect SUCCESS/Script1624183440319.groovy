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

WebUI.setText(findTestObject('Object Repository/Page_/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Lift Revamp_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in'))

WebUI.click(findTestObject('Workflow/SidebarMenu_ProjectsManagement'))

WebUI.click(findTestObject('Object Repository/Page_/a_Projects'))

WebUI.click(findTestObject('Object Repository/Page_/i_Last Update2021-06-08 060231_fa fa-fw fa-pencil'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Project Name_project_name'), 'Test II edit')

WebUI.click(findTestObject('Object Repository/Page_/div_USR0096 - PM1'))

WebUI.click(findTestObject('Object Repository/Page_/div_USR0074 - Dev Project Manager'))

WebUI.click(findTestObject('User/FormUser_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Page_/div_Save_swal2-success-ring'))

WebUI.click(findTestObject('Object Repository/Page_/h2_Project updated'))

WebUI.click(findTestObject('Object Repository/Page_/button_OK'))

