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

WebUI.click(findTestObject('Workflow/Expand Filter Workflow/Page_/button_Filter Workflow_collapse-link text-s_20c2c0'))

isForm = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Expand Filter Workflow/Page_/div_Title   FilterStatus Choose Status'))

isCevronUp = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Expand Filter Workflow/Page_/i_Filter Workflow_fa fa-chevron-up'))

expand = (isForm && isCevronUp)

assert expand == true

WebUI.click(findTestObject('Object Repository/Workflow/Expand Filter Workflow/Page_/button_Filter Workflow_collapse-link text-s_20c2c0'))

isForm = WebUI.verifyElementNotVisible(findTestObject('Object Repository/Workflow/Expand Filter Workflow/Page_/div_Title   FilterStatus Choose Status'))

isCevronDown = WebUI.verifyElementVisible(findTestObject('Object Repository/Workflow/Expand Filter Workflow/Page_/i_Filter Workflow_fa fa-chevron-down'))

collapse = (isForm && isCevronDown)

assert collapse == true

WebUI.delay(2)

WebUI.click(findTestObject('Workflow/Expand Filter Workflow/Page_/button_Filter Workflow_collapse-link text-s_20c2c0'))

