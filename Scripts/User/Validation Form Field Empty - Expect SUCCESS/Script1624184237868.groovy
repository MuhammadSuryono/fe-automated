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

WebUI.setText(findTestObject('Object Repository/User/Validation Field Empty/Page_/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Validation Field Empty/Page_/input_Lift Revamp_password'), 
    'aeHFOx8jV/A=')

WebUI.doubleClick(findTestObject('Object Repository/User/Validation Field Empty/Page_/button_Log in'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/a_User Management'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/li_User Management  User Role'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/a_User'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/button_Add New User'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/small_Fullname is Required'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/small_Username is Required'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/small_Email is required'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/small_Status value only allowed'))

WebUI.click(findTestObject('Object Repository/User/Validation Field Empty/Page_/button_Close'))

WebUI.closeBrowser()
