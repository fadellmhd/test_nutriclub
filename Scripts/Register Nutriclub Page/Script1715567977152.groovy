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

WebUI.click(findTestObject('Register Button'))

WebUI.setText(findTestObject('Register Page/Input Nama Lengkap'), 'Fami')

WebUI.setText(findTestObject('Register Page/Input No. Handphone (Terhubung Whatsapp)'), '089712344321')

WebUI.setEncryptedText(findTestObject('Register Page/Input Password'), 'N7HJqLlUfAvFoavH9nBpXw==')

WebUI.click(findTestObject('Register Page/Hiding Kata Sandi'))

WebUI.click(findTestObject('Register Page/Pilih Kondisi Mama saat ini'))

WebUI.click(findTestObject('Register Page/Pilihan Sedang Hamil-Memiliki Anak'))

WebUI.click(findTestObject('Register Page/Pilih Kondisi Mama saat ini'))

WebUI.verifyElementClickable(findTestObject('Register Page/Pilihan Sedang Hamil'))

WebUI.verifyElementClickable(findTestObject('Register Page/Pilihan Tidak Hamil'))

WebUI.verifyElementClickable(findTestObject('Register Page/Pilihan Tidak Hamil-Memiliki Anak'))

WebUI.click(findTestObject('Register Page/Pilih Kondisi Mama saat ini'))

WebUI.setText(findTestObject('Register Page/Input Usia Kehamilan (Minggu)'), '4')

WebUI.setText(findTestObject('Register Page/Input Tanggal Lahir Anak'), '01-05-2023')

WebUI.click(findTestObject('Register Page/Pointer Kode Event'))

WebUI.click(findTestObject('Register Page/Pointer Kode Referal'))

WebUI.setText(findTestObject('Register Page/Input Kode Referal (opsional)'), 'IBU13791')

WebUI.click(findTestObject('Register Page/Checkbox Agreement-Cookie'))

WebUI.click(findTestObject('Login Page/iframe_Lupa Kata Sandi'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Register Page/Button DAFTAR'))

WebUI.verifyElementClickable(findTestObject('Register Page/Sudah punya akun-Login Disini'))

