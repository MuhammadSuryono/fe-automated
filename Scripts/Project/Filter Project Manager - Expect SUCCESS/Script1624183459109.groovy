import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
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

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Page_/div_- Choose Project Manager -'))

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Page_/div_USR0096 - PM1'))

managerSelected = WebUI.getText(findTestObject('Projects/Filter Project Manager/Page_/div_USR0096 - PM1'))

Pattern regex = Pattern.compile('(:?s|PM1)')

Matcher match = regex.matcher(managerSelected)

if (match.find()) {
    String result = match.group()

    managerName = result
}

WebUI.click(findTestObject('Object Repository/Projects/Filter Project Manager/Page_/button_Filter'))

managerSearchTable = WebUI.getText(findTestObject('Projects/Filter Project Manager/Page_/td_PM1'))

assert managerName == managerSearchTable

assert true

WebUI.click(findTestObject('Projects/Expand Project Filter/Page_/button_Project Filter_collapse-link text-secondary btn-default btn btn-link btn-sm'))

