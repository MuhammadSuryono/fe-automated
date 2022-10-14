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

WebUI.click(findTestObject('Projects/Expand Project Filter/Page_/button_Project Filter_collapse-link text-secondary btn-default btn btn-link btn-sm'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/div_- Choose Status -'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/div_Active'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/button_Filter'))

statusActive = WebUI.getText(findTestObject('Projects/Filter Project Manager/Filter Project Status/Page_/span_ACTIVE'))

assert statusActive == 'ACTIVE'

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/div_- Choose Status -'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/div_Not Active'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Filter Project Status/Page_/button_Filter'))

statusNonActive = WebUI.getText(findTestObject('Projects/Filter Project Manager/Filter Project Status/Page_/span_NON ACTIVE'))

assert statusNonActive == 'NON ACTIVE'

WebUI.click(findTestObject('Projects/Expand Project Filter/Page_/button_Project Filter_collapse-link text-secondary btn-default btn btn-link btn-sm'))

