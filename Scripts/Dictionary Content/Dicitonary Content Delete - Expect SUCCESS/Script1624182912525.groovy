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

//totalDictionary = WebUI.getText(findTestObject('Dictionary Content Delete/summary_total_dictionary_contents'))
//
//Pattern regex = Pattern.compile('//d+')
//
//Matcher match = regex.matcher(totalDictionary)
//
//if (match.find()) {
//
//	String result = match.group()
//	
//	System.out.println("TOTAL " + result)
//	
//	totalDictionaryBeforeDelete = result
//}
WebUI.click(findTestObject('Dictionary Content Delete/button_Last Update2021-06-15 181118_btn-def_34a300'))

iconQuestion = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_'))

assert iconQuestion == true

titleQuestion = WebUI.getText(findTestObject('Dictionary Content Delete/h2_Are You Sure'))

assert titleQuestion == 'Are You Sure ?'

commentBeforeDelete = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_Do you really want to delete 41474 - Ca_7d4239'))

assert commentBeforeDelete == true

buttonCancel = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/button_Cancel'))

assert buttonCancel == true

buttonYes = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/button_Last Update2021-06-15 181118_btn-def_34a300'))

assert buttonYes == true

WebUI.click(findTestObject('Dictionary Content Delete/button_Yes'))

iconSuccessDelete = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/div_www.lifewood.com_swal2-success-ring'))

assert iconSuccessDelete == true

messageSuccessDelete = WebUI.verifyElementVisible(findTestObject('Dictionary Content Delete/h2_Success delete dictionary content'))

messageSuccessDelete == true

WebUI.click(findTestObject('Dictionary Content Delete/button_OK'))

dataFirstRow = WebUI.getText(findTestObject('Dictionary Content Delete/td_Leka'))

