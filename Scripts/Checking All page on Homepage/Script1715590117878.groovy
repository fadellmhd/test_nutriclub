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

WebUI.delay(5)

WebUI.click(findTestObject('Button cookie Saya Setuju'))

WebUI.click(findTestObject('Popup/Button Nanti_notnow'))

WebUI.click(findTestObject('Button Artikel page'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Button Produk page'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Button Tools page'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Button Nutriclub page'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Button Upload Struk page'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Card Bayi'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Card Anak'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.click(findTestObject('Card Kehamilan-Menyusui'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.scrollToElement(findTestObject('Card Anak'), 0)

WebUI.click(findTestObject('Artikel Terbaru Lihat Semua Button'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.scrollToElement(findTestObject('Artikel Terbaru Lihat Semua Button'), 0)

WebUI.click(findTestObject('Kategori Artikel Lihat Semua Button'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.scrollToElement(findTestObject('Kategori Artikel Lihat Semua Button'), 0)

WebUI.click(findTestObject('Contact Us Button'))

WebUI.click(findTestObject('Button Lanjut dan Setuju ContactUS'))

WebUI.click(findTestObject('Button Back Homepage'))

WebUI.scrollToElement(findTestObject('Contact Us Button'), 0)

