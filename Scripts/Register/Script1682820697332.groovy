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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com/')

WebUI.click(findTestObject('Object Repository/Register/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Register/input_nama toko_name'), 'tokokazuha')

WebUI.setText(findTestObject('Object Repository/Register/input_email_email'), 'kazuha@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_password_password'), '4hq/NUNFRf9qhP3cKfb3Fg==')

WebUI.click(findTestObject('Object Repository/Register/button_daftar'))

WebUI.click(findTestObject('Object Repository/Register/div_Toko berhasil didaftarkan'))

WebUI.closeBrowser()

