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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

clickBatchMenu()

WebUI.click(findTestObject('Form Batch/Page_ButtonAddBatch'))

waitSelectProjectPopulated()

selectProjectName(chooseProjectName)

waitSelectSitePopulated()

selectSiteName(chooseSite)

String excelPath = getAbsoultePathBatchExcel(batchFile)

WebUI.uploadFile(findTestObject('Form Batch/FormBatch_InputFileExcelBatch'), excelPath)

WebUI.setText(findTestObject('Form Batch/FormBatch_InputNumberImageQuantity'), quantity)

inputPriority(priority)

WebUI.click(findTestObject('User/FormUser_ButtonSave'))

checkMarkIconVisible = WebUI.verifyElementVisible(findTestObject('Role/DialogCreateSuccess_IconSuccess'))

assert checkMarkIconVisible : 'User should see checkmark gif'

messageDialog = WebUI.getText(findTestObject('Form Batch/DialogSuccessCreate_TextSaveBatchSuccessFileInProcessing'))

assert messageDialog.contains('Save batch success')

WebUI.waitForElementClickable(findTestObject('Form Batch/SuccessDialog_ButtonOK'), 1)

WebUI.click(findTestObject('Form Batch/SuccessDialog_ButtonOK'))

def waitSelectProjectPopulated() {
    WebUI.click(findTestObject('Form Batch/FormBatch_SelectProjectName'))

    WebUI.waitForElementVisible(findTestObject('Form Batch/FormBatch_SelectProjectNameFirstValue'), 3)
}

def waitSelectSitePopulated() {
    WebUI.waitForElementClickable(findTestObject('Form Batch/FormBatch_SelectSiteName'), 1)

    WebUI.click(findTestObject('Form Batch/FormBatch_SelectSiteName'))

    WebUI.waitForElementVisible(findTestObject('Form Batch/FormBatch_SelectSiteNameFirstRow'), 3)
}

def clickBatchMenu() {
    isExpandedUserManagement = WebUI.waitForElementVisible(findTestObject('Form Batch/SidebarMenu_Batch'), 1)

    if (!(isExpandedUserManagement)) {
        WebUI.click(findTestObject('Form Batch/SidebarMenu_FileManagement'))
    }
    
    WebUI.click(findTestObject('Form Batch/SidebarMenu_Batch'))
}

def selectProjectName(String project) {
    WebUI.click(findTestObject('Form Batch/FormBatch_SelectProjectName'))

    WebUI.waitForElementVisible(findTestObject('Form Batch/FormBatch_SelectProjectNameFirstValue'), 3)

    WebUI.click(findTestObject('Form Batch/FormBatch_SelectProjectName'))

    WebUI.setText(findTestObject('Form Batch/FormBatch_InputProjectName'), project)

    WebUI.sendKeys(findTestObject('Form Batch/FormBatch_InputProjectName'), Keys.chord(Keys.TAB))
}

def selectSiteName(String site) {
    WebUI.waitForElementClickable(findTestObject('Form Batch/FormBatch_SelectSiteName'), 1)

    WebUI.click(findTestObject('Form Batch/FormBatch_SelectSiteName'))

    WebUI.waitForElementVisible(findTestObject('Form Batch/FormBatch_SelectSiteNameFirstRow'), 3)

    WebUI.sendKeys(findTestObject('Form Batch/FormBatch_InputSiteName'), site)

    WebUI.sendKeys(findTestObject('Form Batch/FormBatch_InputSiteName'), Keys.chord(Keys.TAB))
}

String getAbsoultePathBatchExcel(String fileName) {
    absolutePath = Paths.get(RunConfiguration.getProjectDir(), 'Revamp Data Files', 'Batch', fileName)

    absolutePathStr = absolutePath.toString()

    print('Path: ' + absolutePathStr)

    return absolutePathStr
}

def inputPriority(String p) {
    WebUI.setText(findTestObject('Form Batch/FormBatch_InputSelectPriority'), p)

    WebUI.sendKeys(findTestObject('Form Batch/FormBatch_InputSelectPriority'), Keys.chord(Keys.TAB))
}

