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

WebUI.click(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/button_Last Update2021-06-20 164228_btn-def_09d87e'))

isIconQuestion = WebUI.verifyElementVisible(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/div_'))

assert isIconQuestion == true

isTitleMessage = WebUI.verifyElementVisible(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/h2_Are You Sure'))

assert isTitleMessage == true

isMessageConfirmationDelete = WebUI.verifyElementVisible(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/div_Do you really want to delete Labeling D_1b97f6'))

assert isMessageConfirmationDelete == true

WebUI.click(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/button_Yes'))

isIconSuccessDelete = WebUI.verifyElementVisible(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/div_www.lifewood.com_swal2-success-ring'))

assert isIconSuccessDelete == true

isMessageSuccessDelete = WebUI.verifyElementVisible(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/h2_Success delete task type'))

assert isMessageSuccessDelete == true

WebUI.click(findTestObject('Object Repository/Task Type/Delete Task Type/Page_/button_OK'))

