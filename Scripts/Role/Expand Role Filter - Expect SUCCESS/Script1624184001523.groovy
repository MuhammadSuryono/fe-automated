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

WebUI.click(findTestObject('Role/Expand Role/Page_/button_Filter Role_collapse-link text-secon_3b7e7e'))

isChevronUp = WebUI.verifyElementVisible(findTestObject('Role/Expand Role/Page_/i_Filter Role_fa fa-chevron-up'))

isForm = WebUI.verifyElementVisible(findTestObject('Role/Expand Role/Page_/div_Name'))

expand = isChevronUp && isForm

assert expand == true

WebUI.click(findTestObject('Role/Expand Role/Page_/button_Filter Role_collapse-link text-secon_3b7e7e'))

isChevronDown = WebUI.verifyElementNotVisible(findTestObject('Role/Expand Role/Page_/i_Filter Role_fa fa-chevron-down'))

isForm = WebUI.verifyElementVisible(findTestObject('Role/Expand Role/Page_/div_Name'))

collapse = isChevronDown && isForm

assert collapse == true
