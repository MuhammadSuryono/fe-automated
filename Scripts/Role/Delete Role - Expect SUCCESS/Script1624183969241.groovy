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

WebUI.click(findTestObject('Role/Delete Role/Page_/Page_ButtonDelete'))

tittleConfirmation = WebUI.getText(findTestObject('Role/Delete Role/Page_/DialogConfirmDelete_TextTitleAreYouSure'))

assert tittleConfirmation == "Are You Sure ?"

isMessageConfirmation = WebUI.verifyElementVisible(findTestObject('Role/Delete Role/Page_/DialogConfirmDelete_TextMessageDoYouWantToDelete'))

assert isMessageConfirmation == true

isBtnCancel = WebUI.verifyElementVisible(findTestObject('Role/Delete Role/Page_/DialogConfirmDelete_ButtonCancel'))

assert isBtnCancel == true

WebUI.click(findTestObject('Role/Delete Role/Page_/DialogConfirmDelete_ButtonYes'))

isSuccessIcon = WebUI.verifyElementVisible(findTestObject('Object Repository/Role/Delete Role/Page_/div_www.lifewood.com_swal2-success-ring'))

assert isSuccessIcon == true

messageSuccessDelete = WebUI.getText(findTestObject('Object Repository/Role/Delete Role/Page_/h2_Role deleted'))

assert messageSuccessDelete == "Role deleted"

WebUI.click(findTestObject('Role/Delete Role/Page_/DialogDelete_ButtonOk'))

