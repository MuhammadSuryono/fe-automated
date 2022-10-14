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

isExpandedUserManagement = WebUI.waitForElementVisible(findTestObject('Role/SidebarMenu_Role'), 1)

if (!(isExpandedUserManagement)) {
    WebUI.click(findTestObject('Role/SidebarMenu_UserManagement'))
}

WebUI.click(findTestObject('Role/SidebarMenu_Role'))

WebUI.waitForElementVisible(findTestObject('Role/ListRole_FirstRow'), 0)

WebUI.click(findTestObject('Role/Page_ButtonAddRole'))

WebUI.click(findTestObject('Role/FormRole_SelectPolicies'))

WebUI.waitForElementPresent(findTestObject('Role/FormRole _FirstSelectPolicies'), 10)

WebUI.setText(findTestObject('Role/FormRole_InputTextName'), role_name)

String[] split = policies.split(',')

int splitLength = split.size()

WebUI.click(findTestObject('Role/FormRole_SelectPolicies'))

for (int i = 0; i < splitLength; i++) {
    WebUI.setText(findTestObject('Role/FormRole_InputTextPolicies'), split[i])
    WebUI.sendKeys(findTestObject('Role/FormRole_InputTextPolicies'), Keys.chord(Keys.TAB))
}

WebUI.click(findTestObject('Role/FormRole_ButtonSave'))

checkMarkIconVisible = WebUI.verifyElementVisible(findTestObject('Role/DialogCreateSuccess_IconSuccess'))

assert checkMarkIconVisible : 'User should see checkmark gif'

messageDialog = WebUI.getText(findTestObject('Role/DialogSuccessCreate_TextRoleCreated'))

assert messageDialog.equals('Role Created')

WebUI.click(findTestObject('Role/DialogSuccessCreate_ButtonOk'))

