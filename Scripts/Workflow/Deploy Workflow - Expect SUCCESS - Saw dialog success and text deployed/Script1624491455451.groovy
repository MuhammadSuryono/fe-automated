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

'Click batch menu on sidebar'
clickBatchMenu()

'Wait first row visible'
WebUI.waitForElementVisible(findTestObject('Workflow/TableWorkflow_FirstRow'), 3)

'Find deploy button for given title'
btnDeploy = findDeployButtonForTitle(sanitizeWorkflowTitle(workflowTitle))

'Click deploy button'
WebUI.click(btnDeploy)

'Verify dialog confirmation wordings and buttons'
verifyDialogConfirmationUI()

'Confirm to deploy'
WebUI.click(findTestObject('Workflow/DialogDeploy_ButtonYes'))

'Verify dialog deploy success'
verifyDialogDeployResult()

'Click button OK'
WebUI.click(findTestObject('Workflow/Dialog_ButtonOK'))

def findDeployButtonForTitle(def expectedTitle) {
    WebDriver driver = DriverFactory.getWebDriver()

    String rowSelector = '/html/body/div[1]/div/div/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr'

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

            String btnSelector = String.format('/html/body/div[1]/div/div/div/div[3]/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr[%d]/td[7]/div/span[3]/button', 
                pos)

            TestObject btnDeploy = new TestObject().addProperty('xpath', ConditionType.EQUALS, btnSelector)

            WebUI.verifyElementPresent(btnDeploy, 1)

            return btnDeploy
            
            break
        }
    }
    
    return null
}

def clickBatchMenu() {
    isExpandedProjectsManagement = WebUI.waitForElementVisible(findTestObject('Workflow/SidebarMenu_Workflow'), 1)

    if (!(isExpandedProjectsManagement)) {
        WebUI.click(findTestObject('Workflow/SidebarMenu_ProjectsManagement'))
    }
    
    WebUI.click(findTestObject('Workflow/SidebarMenu_Workflow'))
}

def verifyDialogConfirmationUI() {
    deployConfirmation = WebUI.getText(findTestObject('Workflow/DialogDeploy_TextTitleConfirmation'))

    deployMessageConfirmation = WebUI.getText(findTestObject('Workflow/DialogDeploy_TextConfirm'))

    hasBtnCancel = WebUI.verifyElementVisible(findTestObject('Workflow/DialogDeploy_ButtonCancel'))

    hasBtnYes = WebUI.verifyElementVisible(findTestObject('Workflow/DialogDeploy_ButtonYes'))

    WebUI.verifyElementClickable(findTestObject('Workflow/DialogDeploy_ButtonYes'))

    assert deployConfirmation == 'Workflow Confirmation'

    assert deployMessageConfirmation == String.format('Do you want to deploy %s ?', sanitizeWorkflowTitle(workflowTitle))

    assert hasBtnCancel == true : 'expect dialog confirmation has cancel button'

    assert hasBtnYes == true : 'expect dialog confirmation has yes button'
}

def verifyDialogDeployResult() {
    iconSuccess = WebUI.verifyElementVisible(findTestObject('Workflow/DialogDeploy_ImageCheckmark'))

    messageSuccess = WebUI.getText(findTestObject('Workflow/Dialog_TextTitle'))

    assert iconSuccess == true : 'expect see checkmark gif'

    assert messageSuccess.equals('Workflow Deployed') : 'expect response Workflow Deployed'
}

def sanitizeWorkflowTitle(String s) {
    return s.replace('.bpmn', '')
}

