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

// Logo is exists
logoLogin = WebUI.verifyElementVisible(findTestObject('Form Login/logo_lifewood_login'))

assert logoLogin == true : 'Logo lifewood exists'

// Title login 
objectTitleLogin = findTestObject('Form Login/title Lift Revamp login')

assert WebUI.getText(objectTitleLogin) == 'Lift Revamp'

assert WebUI.verifyElementVisible(objectTitleLogin) : 'Title in login exists'

// Version app
appVersion = WebUI.verifyElementVisible(findTestObject('Form Login/app_version_login'))

assert appVersion == true : 'App version exists'

// login form
formUsername = WebUI.verifyElementVisible(findTestObject('Form Login/input_Lift Revamp_username'))

assert formUsername == true : 'Form Username exists'

formPassword = WebUI.verifyElementVisible(findTestObject('Form Login/input password login'))

assert formPassword == true : 'Form password exists'

buttonSubmit = WebUI.verifyElementAttributeValue(findTestObject('Form Login/button_Log in'), 'type', 'submit', 3)

assert buttonSubmit == true : 'Button type submit'

