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
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.testobject.ConditionType as ConditionType

isExpandedProjectsManagement = WebUI.waitForElementVisible(findTestObject('Projects/SidebarMenu_Project'), 1)

if (!(isExpandedProjectsManagement)) {
    WebUI.click(findTestObject('Projects/SidebarMenu_ProjectsManagement'))
}

WebUI.click(findTestObject('Projects/SidebarMenu_Project'))

WebUI.waitForElementVisible(findTestObject('Projects/TableProject_FirstRow'), 3)

btnLinkSite = findSiteLinkForTitle(project)

WebUI.click(btnLinkSite)

WebUI.waitForElementVisible(findTestObject('Assign Site/FormAssignSite_ButtonAddProjectSite'), 3)

WebUI.click(findTestObject('Assign Site/FormAssignSite_ButtonAddProjectSite'))

WebUI.click(findTestObject('Assign Site/FormAssignSite_SelectSite'))

String[] split = siteName.split(',')

int splitLength = split.size()

for (int i = 0; i < splitLength; i++) {
    WebUI.setText(findTestObject('Assign Site/FormAssignSite_InputTextSite'), split[i])

    WebUI.sendKeys(findTestObject('Assign Site/FormAssignSite_InputTextSite'), Keys.chord(Keys.TAB))
}

WebUI.click(findTestObject('Assign Site/FormAssignSite_ButtonSave'))

messageSuccess = WebUI.getText(findTestObject('Assign Site/DialogSuccessCreate_TextSaveSiteProjectSuccess'))

assert messageSuccess == 'Save site project is success!'

WebUI.click(findTestObject('Assign Site/DialogSuccessCreate_ButtonOk'))

def findSiteLinkForTitle(def expectedTitle) {
    WebDriver driver = DriverFactory.getWebDriver()

    rowSelector = '/html/body/div[1]/div/div/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr'

    int rowCount = driver.findElements(By.xpath(rowSelector)).size()

    println(String.format('Rows count: %d', rowCount))

    for (int pos = 1; pos <= rowCount; pos++) {
        String titleSelector = String.format('/html/body/div[1]/div/div/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr[%d]/td[3]', 
            pos)

        TestObject to = new TestObject().addProperty('xpath', ConditionType.EQUALS, titleSelector)

        WebUI.verifyElementPresent(to, 1)

        String title = WebUI.getText(to)

        if (title == expectedTitle) {
            println(String.format('Match title expected: %s vs actual: %s', title, expectedTitle))

            String btnSelector = String.format('/html/body/div[1]/div/div/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr[%d]/td[5]/span/button', 
                pos)

            TestObject btnLinkSite = new TestObject().addProperty('xpath', ConditionType.EQUALS, btnSelector)

            WebUI.verifyElementPresent(btnLinkSite, 1)

            return btnLinkSite
            
            break
        }
    }
    
    return null
}

