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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://revamp.lifewood.dev/app/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_/input_Lift Revamp_username'), 'revamp_yono')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Lift Revamp_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in'))

hasErrorMessage = WebUI.waitForElementVisible(findTestObject('Form Login/div_Invalid username or password'), 3)

// Definisi login berhasil
// error message tidak ada
// atau 
// redirected to https://revamp.lifewood.dev/app/dashboard
// atau
// profile image found
'Login failed when user see error message'
assert hasErrorMessage == true

