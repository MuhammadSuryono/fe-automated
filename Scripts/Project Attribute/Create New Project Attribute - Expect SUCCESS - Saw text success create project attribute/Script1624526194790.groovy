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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

isExpandedProjectManagement = WebUI.waitForElementVisible(findTestObject('Project Attribute/SidebarMenu_ProjectAttribute'), 
    1)

if (!(isExpandedProjectManagement)) {
    WebUI.click(findTestObject('Project Attribute/SidebarMenu_ProjectsManagement'))
}

WebUI.click(findTestObject('Project Attribute/SidebarMenu_ProjectAttribute'))

WebUI.click(findTestObject('Project Attribute/Page_ButtonAddProjectAttribute'))

WebUI.click(findTestObject('Project Attribute/FormProjectAttribute_SelectProject'))

WebUI.setText(findTestObject('Project Attribute/FormProjectAttribute_InputTextProjectName'), projectName)

WebUI.sendKeys(findTestObject('Project Attribute/FormProjectAttribute_InputTextProjectName'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Project Attribute/FormProjectAttribute_InputTextAttributeName'), attributeName)

WebUI.click(findTestObject('Project Attribute/FormProjectAttribute_SelectTaskType'))

WebUI.setText(findTestObject('Project Attribute/FormProjectAttribute_InputTextTaskType'), taskType)

WebUI.sendKeys(findTestObject('Project Attribute/FormProjectAttribute_InputTextTaskType'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Project Attribute/FormProjectAttribute_SelectAttributeTypes'))

WebUI.setText(findTestObject('Project Attribute/FormProjectAttribute_InputTextAttributeTypes'), attributeType)

WebUI.sendKeys(findTestObject('Project Attribute/FormProjectAttribute_InputTextAttributeTypes'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Project Attribute/FormProjectAttribute_SelectShouldProcess'))

WebUI.setText(findTestObject('Project Attribute/FormProjectAttribute_InputTextShouldProcess'), shouldProcess)

WebUI.sendKeys(findTestObject('Project Attribute/FormProjectAttribute_InputTextShouldProcess'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Project Attribute/FormProjectAttribute_ButtonSave'))

messageSuccessCreate = WebUI.getText(findTestObject('Project Attribute/DialogSuccessCreate_TextSuccessCreateNewProjectAttribute'))

assert messageSuccessCreate == 'Success create new Project Attribute'

WebUI.click(findTestObject('Project Attribute/DialogSuccessCreate_ButtonOK'))

