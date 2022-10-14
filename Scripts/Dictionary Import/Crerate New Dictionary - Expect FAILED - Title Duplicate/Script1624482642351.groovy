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

WebUI.setText(findTestObject('Dictionary Content Create/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Dictionary Content Create/input_Lift Revamp_password'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Dictionary Content Create/input_Lift Revamp_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Dictionary Content Create/a_Projects Management'))

WebUI.click(findTestObject('Dictionary Content Create/a_Dictionary'))

WebUI.click(findTestObject('Dictionary Content Create/button_Add Dictionary'))

WebUI.setText(findTestObject('Dictionary Content Create/input_Dictionary Name_title'), 'Haiti Comment')

WebUI.click(findTestObject('Dictionary Content Create/button_Select File'))

WebUI.click(findTestObject('Dictionary Content Create/button_Save'))

iconError = WebUI.verifyElementNotVisible(findTestObject('Dictionary/SuccessDialog_GifCheckmark'))

assert iconError == true

messageCreateDictionary = WebUI.getText(findTestObject('Dictionary Content Create/h2_Success create data dictionary Dictionar_d1ea61'))

Pattern regex = Pattern.compile(regexAlreadyExists)

Matcher match = regex.matcher(messageCreateDictionary)

assert match.find() == true

WebUI.click(findTestObject('Dictionary Content Create/button_OK'))

WebUI.closeBrowser()

