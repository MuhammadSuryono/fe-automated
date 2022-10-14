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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Login/Login Sucess'), [('hasErrorMessage') : false, ('seeProfilePicture') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site Management'))

WebUI.click(findTestObject('Object Repository/Site Page/Page_/a_Site'))

siteId = WebUI.getText(findTestObject('Site Page/Page_/site table site id'))

siteName = WebUI.getText(findTestObject('Site Page/Page_/td_site table'))

String[] splitSiteManagerText = WebUI.getText(siteManagerRow).split(' ')

getNumber = (splitSiteManagerText[0]).toInteger()

WebUI.click(findTestObject('Site Page/Page_/button_1 Site Manager'))

titleAssignManager = WebUI.waitForElementVisible(titleInAssignManager, 10)

assert titleAssignManager

'verify box panel in site manager'
boxSiteManager = WebUI.verifyElementInViewport(findTestObject('Site Manager/Page_/box site manager'), 10)

buttonBack = WebUI.verifyElementInViewport(findTestObject('Page_/button_Back'), 10)

assert boxSiteManager && buttonBack

String title = (('Assign Manager: ' + siteId) + ' - ') + siteName

'Get title assign manager'
String[] getTitle = WebUI.getText(titleInAssignManager).split('Back ')

'compare text'
assert (getTitle[1]) == title

WebDriver driver = DriverFactory.getWebDriver()
WebElement Table = driver.findElement(By.xpath("//table/tbody"))
List<WebElement> row_table = Table.findElements(By.tagName('tr'))
int rows_count = row_table.size()

assert getNumber == rows_count

WebUI.click(findTestObject('Page_/button_Back'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Site Page/Page_/title_Site'), 10)

titleSite = WebUI.verifyElementText(findTestObject('Object Repository/Site Page/Page_/title_Site'), 'Site')

assert titleSite == true

WebUI.closeBrowser()

