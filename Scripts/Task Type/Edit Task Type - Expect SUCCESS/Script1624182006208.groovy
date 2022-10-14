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

WebUI.click(findTestObject('Object Repository/Page_/i_Last Update2021-06-09 043735_fa fa-fw fa-pencil'))

WebUI.setText(findTestObject('Task Type/FormTaskType_InputTextTaskName'), 'test task type edit')

WebUI.click(findTestObject('User/FormUser_ButtonSave'))

isIconSuccessEdit = WebUI.verifyElementVisible(findTestObject('Task Type/Edit Task Type/Page_/icon_success_update'))

assert isIconSuccessEdit == true

isMessageSuccessEdit = WebUI.verifyElementVisible(findTestObject('Task Type/Edit Task Type/Page_/h2_Success update task type'))

assert isMessageSuccessEdit == true

WebUI.click(findTestObject('Task Type/Edit Task Type/Page_/button_OK_success_update'))

