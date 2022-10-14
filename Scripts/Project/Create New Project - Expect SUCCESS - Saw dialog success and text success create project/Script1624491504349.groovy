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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

clickMenuProject()

clickButtonAddProject()

WebUI.setText(findTestObject('Projects/FormProject_InputTextProjectName'), projectName)

populatePMOptions()

WebUI.setText(findTestObject('Projects/FormProject_InputTextProjectManager'), managerList)

WebUI.sendKeys(findTestObject('Projects/FormProject_InputTextProjectManager'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Projects/FormProject_SelectWorkflow'))

WebUI.setText(findTestObject('Projects/FormProject_InputTextWorkflow'), workflowList)

WebUI.sendKeys(findTestObject('Projects/FormProject_InputTextWorkflow'), Keys.chord(Keys.TAB))

inputDateStart(startDate)

inputDateEnd(endDate)

WebUI.click(findTestObject('Projects/FormProject_SelectStatus'))

WebUI.setText(findTestObject('Projects/FormProject_InputTextStatus'), status)

WebUI.sendKeys(findTestObject('Projects/FormProject_InputTextStatus'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Projects/FormProject_ButtonSave'))

messageSuccessCreateProject = WebUI.getText(findTestObject('Projects/DialogSuccessCreate_TextSuccessCreateProject'))

assert messageSuccessCreateProject == 'Success create project'

WebUI.click(findTestObject('Projects/DialogSuccessCreate_ButtonOk'))

def clickMenuProject() {
    isExpandedProjectsManagement = WebUI.waitForElementVisible(findTestObject('Projects/SidebarMenu_Project'), 
        1)

    if (!(isExpandedProjectsManagement)) {
        WebUI.click(findTestObject('Projects/SidebarMenu_ProjectsManagement'))
    }
    
    WebUI.click(findTestObject('Projects/SidebarMenu_Project'))
}

def clickButtonAddProject() {
    WebUI.waitForElementVisible(findTestObject('Projects/ProjectPage_ButtonAddProject'), 1)

    WebUI.click(findTestObject('Projects/ProjectPage_ButtonAddProject'))
}

def populatePMOptions() {
    WebUI.click(findTestObject('Projects/FormProject_SelectProjectManager -'))

    WebUI.waitForElementVisible(findTestObject('Projects/FormProject_SelectProjectManagerFirstOption'), 3)
}

def inputDateStart(def date) {
    WebUI.click(findTestObject('Projects/FormProject_InputDateStartDate'))

    WebUI.setText(findTestObject('Projects/FormProject_InputDateStartDate'), date)

    WebUI.sendKeys(findTestObject('Projects/FormProject_InputDateStartDate'), Keys.chord(Keys.ESCAPE))

    WebUI.delay(0.35)
}

def inputDateEnd(def date) {
    WebUI.click(findTestObject('Projects/FormProject_InputDateEndDate'))

    WebUI.setText(findTestObject('Projects/FormProject_InputDateEndDate'), date)

    WebUI.sendKeys(findTestObject('Projects/FormProject_InputDateEndDate'), Keys.chord(Keys.ESCAPE))

    WebUI.delay(0.35)
}

