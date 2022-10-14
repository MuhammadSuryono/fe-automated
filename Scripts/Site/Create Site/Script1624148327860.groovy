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

WebUI.click(findTestObject('Site/Sidebar Menu/SidebarMenu_SiteManagement'))

WebUI.click(findTestObject('Site/Sidebar Menu/SidebarMenu_Site'))

WebUI.click(findTestObject('Object Repository/Site/Create Site/Page_/button_Add Site'))

WebUI.setText(findTestObject('Site/Form Site/FormSite_TextInputSiteName'), 'Site 875934503045')

WebUI.click(findTestObject('Site/Form Site/FormSite_SelectStatus'))

if (isStatus) {
    WebUI.setText(findTestObject('Object Repository/Site/Create Site/Page_/input_Status_react-select-3-input'), 'Active')

    WebUI.sendKeys(findTestObject('Object Repository/Site/Create Site/Page_/input_Status_react-select-3-input'), Keys.chord(
            Keys.ENTER))
} else {
    WebUI.setText(findTestObject('Object Repository/Site/Create Site/Page_/input_Status_react-select-3-input'), 'Non Active')

    WebUI.sendKeys(findTestObject('Object Repository/Site/Create Site/Page_/input_Status_react-select-3-input'), Keys.chord(
            Keys.ENTER))
}

WebUI.click(findTestObject('Site/Form Site/FormSite_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Site/Create Site/Page_/h2_Site Created'))

WebUI.click(findTestObject('Site/Create Site/Page_/button_OK_site_success'))

