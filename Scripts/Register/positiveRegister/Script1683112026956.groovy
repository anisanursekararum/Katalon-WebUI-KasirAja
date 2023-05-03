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
import org.apache.commons.lang.RandomStringUtils as RandStr

url = (GlobalVariable.baseURL)+(GlobalVariable.login)

Random rand = new Random ();

upperLimit = 9999999

icnt = rand.nextInt(upperLimit);

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('Object Repository/Register/button_toRegister'))

WebUI.setText(findTestObject('Object Repository/Register/input_nama_toko'), GlobalVariable.name)

WebUI.setText(findTestObject('Object Repository/Register/input_email'), 'kazuha'+icnt.toString()+'@mail.com')

WebUI.setText(findTestObject('Object Repository/Register/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/General/button'))

WebUI.verifyTextPresent(GlobalVariable.alertSuccessRegister1, false)

WebUI.verifyTextPresent(GlobalVariable.alertSuccessRegister2, false)

WebUI.verifyMatch(WebUI.getUrl(), url, false)

