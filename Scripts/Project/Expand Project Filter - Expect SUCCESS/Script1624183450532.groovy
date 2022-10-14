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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement table = driver.findElement(By.cssSelector("[class='table text-nowrap'] tbody"))
//
//List<WebElement> rows = table.findElements(By.tagName("tr"))
WebUI.click(findTestObject('Projects/Expand Project Filter/Page_/button_Project Filter_collapse-link text-secondary btn-default btn btn-link btn-sm'))

/**
 * Verify element box 
 */
expand = WebUI.verifyElementVisible(findTestObject('Projects/Expand Project Filter/Page_/div_NameStatus- Choose Status -Date  Project Manager - Choose Project Manager -Filter'))

assert expand == true

WebUI.click(findTestObject('Projects/Expand Project Filter/Page_/button_Project Filter_collapse-link text-secondary btn-default btn btn-link btn-sm'))

//
collapse = WebUI.verifyElementNotVisible(findTestObject('Projects/Expand Project Filter/Page_/div_NameStatus- Choose Status -Date  Project Manager - Choose Project Manager -Filter'))

//
assert collapse == true

assert true

