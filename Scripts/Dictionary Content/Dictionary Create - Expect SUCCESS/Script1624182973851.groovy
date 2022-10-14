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

WebUI.click(findTestObject('Dictionary Content Create/a_Projects Management'))

WebUI.click(findTestObject('Dictionary Content Create/a_Dictionary'))

WebUI.click(findTestObject('Dictionary Content Create/button_16 Dictionary Contents'))

WebUI.click(findTestObject('Dictionary Content Create/button_Add Content'))

WebUI.setText(findTestObject('Dictionary Content Create/input_Value_title'), 'Car')

WebUI.click(findTestObject('Dictionary Content Create/button_Save'))

messageSuccessCreate = WebUI.verifyElementVisible(findTestObject('Dictionary Content Create/h2_Success add content dictionary'))

assert messageSuccessCreate == true

iconSuccess = WebUI.verifyElementVisible(findTestObject('Dictionary/SuccessDialog_GifCheckmark'))

assert iconSuccess == true

WebUI.click(findTestObject('Dictionary Content Create/button_OK_success'))

dataAfterInsertOnIndex = WebUI.getText(findTestObject('Dictionary Content Create/td_Creator'))

assert dataAfterInsertOnIndex == 'Car'

