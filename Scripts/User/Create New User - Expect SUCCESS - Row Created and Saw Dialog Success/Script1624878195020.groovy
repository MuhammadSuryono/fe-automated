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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

isExpandedUserManagement = WebUI.waitForElementVisible(findTestObject('User/SidebarMenu_User'), 1)

if (!(isExpandedUserManagement)) {
    WebUI.click(findTestObject('User/SidebarMenu_UserManagement'))
}

WebUI.click(findTestObject('User/SidebarMenu_User'))

WebUI.waitForElementVisible(findTestObject('User/TableUser_FirstRow'), 3)

WebUI.click(findTestObject('User/Page_ButtonAddNewUser'))

WebUI.setText(findTestObject('User/FormUser_TextInputFullname'), fullname)

WebUI.setText(findTestObject('User/FormUser_TextInputUsername'), username)

WebUI.setText(findTestObject('User/FormUser_TextInputEmail'), email)

String[] split = role.split(',')

int splitLength = split.size()

for (int i = 0; i < splitLength; i++) {
    WebUI.setText(findTestObject('User/FormUser_InputTextRole'), split[i])

    WebUI.sendKeys(findTestObject('User/FormUser_InputTextRole'), Keys.chord(Keys.TAB))
}

WebUI.setEncryptedText(findTestObject('User/FormUser_TextInputPassword'), password)

WebUI.setEncryptedText(findTestObject('User/FormUser_TextInputConfirmationPassword'), confirm_password)

WebUI.click(findTestObject('User/FormUser_SelectStatus'))

WebUI.setText(findTestObject('User/FormUser_TextInputStatus'), status)

WebUI.sendKeys(findTestObject('User/FormUser_TextInputStatus'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('User/FormUser_ButtonSave'))

isSuccess = WebUI.verifyElementVisible(findTestObject('User/DialogSuccessCreate_IconSuccess'))

assert isSuccess == true

messageSuccessCreate = WebUI.getText(findTestObject('User/DialogSuccessCreate_TextSuccessCreateUser'))

assert messageSuccessCreate == 'Success create user'

WebUI.click(findTestObject('User/DialogSuccessCreate_ButtonOk'))

resultRow = WebUI.getText(findTestObject('User/TableUser_ColumnUsername'))

assert resultRow == username

