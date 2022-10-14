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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://revamp.lifewood.dev/app/auth/login')

WebUI.setText(findTestObject('Dictionary Content Search/input_Lift Revamp_username'), 'revamp_husnan')

WebUI.setEncryptedText(findTestObject('Dictionary Content Search/input_Lift Revamp_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Dictionary Content Search/button_Log in'))

WebUI.click(findTestObject('Task Type/Expand Filter/Page_/a_System'))

WebUI.click(findTestObject('Task Type/Expand Filter/Page_/a_Task Type'))

WebUI.click(findTestObject('Dictionary Content Search/button_Filter Dictionary_collapse-link text_0897b3'))

WebUI.setText(findTestObject('Task Type/Search Task type/Page_/input_Task Name_filter-form form-control fo_8f7b6f'), 'No Search')

WebUI.click(findTestObject('Dictionary Content Search/button_Filter'))

WebDriverver driver = DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.cssSelector('[class=\'table text-nowrap\'] tbody'))

List<WebElement> rowsAfterSearch = table.findElements(By.tagName('tr'))

WebUI.click(findTestObject('Dictionary Content Search/button_Refresh'))

List<WebElement> rowsAfterButtonRefresh = table.findElements(By.tagName('tr'))

assert rowsAfterSearch < rowsAfterButtonRefresh

WebUI.closeBrowser()

