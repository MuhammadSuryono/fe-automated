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

clickMenuDataEntryField()

WebUI.click(findTestObject('Data Entry Field/DataEntryFieldPage_ButtonAddDataEntryField'))

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_DropdownCreateDataEntryField'))

addFieldInputText()

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldName'), column1)

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldRegex'), regex1)

DialogEntryFieldClickSubmit()

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_DropdownCreateDataEntryField'))

addFieldInputText()

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldName'), column2)

DialogEntryFieldClickSubmit()

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_DropdownCreateDataEntryField'))

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_SelectOptionDictionary'))

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldName'), titleDictionary)

//WebUI.selectOptionByValue(findTestObject('Data Entry Field/FormDataEntryField_SelectDictionary'), columnDictionary, true)
WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_SelectDictionary'), columnDictionary)

WebUI.sendKeys(findTestObject('Data Entry Field/FormDataEntryField_SelectDictionary'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldRegex'), dictionaryRegex)

DialogEntryFieldClickSubmit()

'get dictionary text in input\r\n'
testObjectDictionary = findTestObject('Data Entry Field/FormDataEntryField_inputTextSurnameDictionary')

getValueTestObject = WebUI.getAttribute(testObjectDictionary, "placeholder")
println(getValueTestObject)


assert getValueTestObject == columnDictionary

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_DropdownCreateDataEntryField'))

addFieldInputText()

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextFieldName'), column4)

DialogEntryFieldClickSubmit()

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_ButtonPreview'))

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_ButtonSaveResult'))

WebUI.setText(findTestObject('Data Entry Field/FormDataEntryField_InputTextTitleDataEntry'), titleDataEntryField)

WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_ButtonSaveTitle'))

messageSuccesCreate = WebUI.getText(findTestObject('Data Entry Field/DialogSuccesCreate_TextSuccessCreateForm'))

assert messageSuccesCreate == 'Success create form'

WebUI.click(findTestObject('Data Entry Field/DialogSuccesssCreate_ButtonOk'))

WebUI.click(findTestObject('Data Entry Field/DataEntryFieldPage_TextHeaderDataEntryTable'))

def addFieldInputText() {
    WebUI.click(findTestObject('Data Entry Field/FormDataEntryField_SelectOptionInputText'))
}

def DialogEntryFieldClickSubmit() {
    WebUI.click(findTestObject('Data Entry Field/FormDataEntryFieldPage_ButtonSubmit'))
}

def clickMenuDataEntryField() {
    isExpandedProjectsManagement = WebUI.waitForElementVisible(findTestObject('Data Entry Field/SidebarMenu_DataEntryField'), 
        3)

    if (!(isExpandedProjectsManagement)) {
        WebUI.click(findTestObject('Data Entry Field/SidebarMenu_ProjectsManagement'))
    }
    
    WebUI.click(findTestObject('Data Entry Field/SidebarMenu_DataEntryField'))
}

