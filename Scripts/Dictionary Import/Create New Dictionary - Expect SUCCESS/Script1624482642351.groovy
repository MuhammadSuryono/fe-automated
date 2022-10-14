import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths


clickDictionaryMenu()
WebUI.click(findTestObject('Dictionary/Page_ButtonAddDictionary'))

WebUI.setText(findTestObject('Dictionary/FormDictionary_InputName'), 'Tes Dictionary')

String pathToFile = getAbsoultePathBatchExcel('Haiti_Comments.txt')

WebUI.uploadFile(findTestObject('Dictionary/FormDictionary_InputFileDictionary'), pathToFile)

WebUI.setText(findTestObject('Dictionary/FormDictionary_InputName'), dictionaryName)

WebUI.click(findTestObject('User/FormUser_ButtonSave'))

iconSuccess = WebUI.verifyElementVisible(findTestObject('Dictionary/SuccessDialog_GifCheckmark'))

assert iconSuccess == true

messageSuccess = WebUI.getText(findTestObject('Dictionary/DialogSuccess_TitleDialog'))
assert messageSuccess.contains('Success create data dictionary')
WebUI.waitForElementClickable(findTestObject('Dictionary/SuccessDialog_ButtonOK'), 3)

WebUI.click(findTestObject('Dictionary/SuccessDialog_ButtonOK'))

String getAbsoultePathBatchExcel(String fileName) {
    absolutePath = Paths.get(RunConfiguration.getProjectDir(), 'Revamp Data Files', 'Dictionary', fileName)

    absolutePathStr = absolutePath.toString()

    print('Path: ' + absolutePathStr)

    return absolutePathStr
}


def clickDictionaryMenu() {
	isExpandedUserManagement = WebUI.waitForElementVisible(findTestObject('null'), 3)

	if (!(isExpandedUserManagement)) {
		WebUI.click(findTestObject('Workflow/SidebarMenu_ProjectsManagement'))
	}
	
	WebUI.click(findTestObject('null'))
	
	
	
}

