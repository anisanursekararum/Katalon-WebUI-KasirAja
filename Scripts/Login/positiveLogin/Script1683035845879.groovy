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


url = (GlobalVariable.baseURL)+(GlobalVariable.dashboard)

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.setText(findTestObject('Object Repository/Login/input_email_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login/input_password_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/General/button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/dt_tokokitaHai'))

WebUI.verifyTextPresent(GlobalVariable.name, false)

WebUI.verifyTextPresent('kasirAja', false)

WebUI.verifyMatch(WebUI.getUrl(), url, false)