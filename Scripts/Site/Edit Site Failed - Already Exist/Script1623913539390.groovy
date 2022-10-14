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

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site'))

WebUI.click(findTestObject('Site Page/Page_/btn edit site'))

WebUI.setText(findTestObject('Site Page/Page_/input_Site Name_site_name'), siteName)

'Klik Save'
WebUI.click(findTestObject('User/FormUser_ButtonSave'))

//if (WebUI.waitForElementVisible(findTestObject('Page_/h2_Site name already exist'), 0)) {
//    WebUI.click(findTestObject('Object Repository/Page_/button_OK_already_exist'))
//
//    WebUI.acceptAlert()
//
//    assert true
//}
'Check if already exists'
iconMark = WebUI.waitForElementVisible(findTestObject('AlertDialog/span_Save_swal2-x-mark'), 30)

textAlready = WebUI.waitForElementVisible(findTestObject('AlertDialog/h2_Site name already exist'), 30)

assert iconMark && textAlready

'Klik Dialog OK'
WebUI.click(findTestObject('Page_/button_OK'))

WebUI.click(findTestObject('Site Page/Page_/button_Close'))

