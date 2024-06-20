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

WebUI.verifyElementClickable(findTestObject('Next Button'))

WebUI.click(findTestObject('Next Button'))

WebUI.verifyElementClickable(findTestObject('Previous Button'))

WebUI.click(findTestObject('Previous Button'))

WebUI.scrollToElement(findTestObject('Card Anak'), 3)

WebUI.verifyElementClickable(findTestObject('Card Bayi'))

WebUI.verifyElementClickable(findTestObject('Card Anak'))

WebUI.verifyElementClickable(findTestObject('Card Kehamilan-Menyusui'))

WebUI.scrollToElement(findTestObject('Artikel Terbaru Lihat Semua Button'), 3)

WebUI.verifyTextPresent('Artikel Terbaru', true)

WebUI.verifyTextPresent('Kategori Artikel', true)

WebUI.scrollToElement(findTestObject('Contact Us Button'), 3)

WebUI.verifyElementClickable(findTestObject('Contact Us Button'))

WebUI.scrollToElement(findTestObject('Card Health Immune Checker'), 3)

WebUI.verifyElementClickable(findTestObject('Card Health Immune Checker'))

WebUI.verifyElementClickable(findTestObject('Card Tes Potensi Caesar'))

WebUI.verifyTextPresent('Apa Saja yang Bisa Kami Bantu', true)

WebUI.scrollToElement(findTestObject('Card Podcast'), 3)

WebUI.verifyElementClickable(findTestObject('Card Podcast'))

WebUI.verifyElementClickable(findTestObject('Card Video'))

WebUI.verifyElementClickable(findTestObject('Card E-book'))

WebUI.verifyTextPresent('Nikmati Konten Kami di Media Favorit Anda', true)

WebUI.verifyElementClickable(findTestObject('Asi terbaik bagi bayi Button'))

WebUI.click(findTestObject('Asi terbaik bagi bayi Button'))

WebUI.verifyElementClickable(findTestObject('Tentang Nutricia Button'))

WebUI.click(findTestObject('Tentang Nutricia Button'))

WebUI.verifyElementClickable(findTestObject('Tentang Nutriclub Button'))

WebUI.click(findTestObject('Tentang Nutriclub Button'))

