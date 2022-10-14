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

WebUI.click(findTestObject('Role/Page_ButtonAddRole'))

WebUI.setText(findTestObject('Role/FormRole_InputTextName'), 'Role 343434')

WebUI.click(findTestObject('Role/FormRole_SelectPolicies'))

WebUI.setText(findTestObject('Role/FormRole_InputTextPolicies'), 'My Task Operator')

WebUI.sendKeys(findTestObject('Role/FormRole_InputTextPolicies'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Role/FormRole_ButtonSave'))

messageSuccess = WebUI.getText(findTestObject('Role/DialogSuccessCreate_TextRoleCreated'))

Pattern regex = Pattern.compile('(:?s|Already|Exists)')

Matcher mtch = regex.matcher(messageSuccess)

assert mtch.find() == true

WebUI.click(findTestObject('Role/DialogSuccessCreate_ButtonOk'))

