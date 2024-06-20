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

WebUI.callTestCase(findTestCase('Nutriclub'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login Button'))

WebUI.verifyElementClickable(findTestObject('Login Page/Button Kembali'))

WebUI.setText(findTestObject('Login Page/Input No Handphone'), '085784018007')

WebUI.setEncryptedText(findTestObject('Login Page/Input Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Login Page/Hiding Kata Sandi'))

WebUI.verifyElementClickable(findTestObject('Login Page/Button Lupa Kata Sandi'))

WebUI.click(findTestObject('Login Page/iframe_Lupa Kata Sandi'))

WebUI.verifyElementClickable(findTestObject('Login Page/Button Login Tanpa Kata Sandi'))

WebUI.click(findTestObject('Login Page/Button Login'))

