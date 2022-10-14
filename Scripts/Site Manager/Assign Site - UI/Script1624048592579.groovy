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

WebUI.callTestCase(findTestCase('Login/Login Sucess'), [('hasErrorMessage') : false, ('seeProfilePicture') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_/a_Site Management'))

WebUI.click(findTestObject('Page_/a_Site Manager'))

String [] splitSiteRow = WebUI.getText(siteRow).split(' ')
getAssignSiteNumber = splitSiteRow[0].toInteger()

WebUI.click(findTestObject('Object Repository/Site Manager/Page_/button_1 Site'))

titleAssignSite = WebUI.waitForElementVisible(findTestObject('Object Repository/Site Manager/Page_/h4_Back Site Manager USR0111 - Bela'), 10, FailureHandling.STOP_ON_FAILURE)

assert titleAssignSite

WebUI.verifyElementInViewport(findTestObject('Object Repository/Site Manager/Page_/div_Site ListSite IDSite NameSite ManagerSt_e1c52f'), 10)

String title = 'Site Manager: ' + userCode + ' - ' + fullname

String [] getTitle = WebUI.getText(findTestObject('Object Repository/Site Manager/Page_/h4_Back Site Manager USR0111 - Bela')).split('Back ')
assert getTitle[1] == title

WebDriver driver = DriverFactory.getWebDriver()
WebElement Table = driver.findElement(By.xpath("//table/tbody"))
List<WebElement> row_table = Table.findElements(By.tagName('tr'))
int rows_count = row_table.size()

assert getAssignSiteNumber == rows_count

WebUI.click(findTestObject('Page_/button_Back'))

waitForVisible = WebUI.waitForElementVisible(findTestObject('Site Manager/Page_/title site manager'), 10, FailureHandling.STOP_ON_FAILURE)
assert waitForVisible

title = WebUI.verifyElementText(findTestObject('Site Manager/Page_/title site manager'), 'Site Manager')

assert title == true


WebUI.closeBrowser()

