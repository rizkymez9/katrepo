import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.google.com')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Sign in_q'), 'katalon studio')

WebUI.navigateToUrl('https://www.google.com/search?source=hp&ei=Tnc9XKLyOMyAyAOshYnICw&q=katalon+studio&btnK=Google+Search&oq=katalon+studio&gs_l=psy-ab.3..0l10.3159.5927..8370...0.0..0.699.4336.1j5j2j2j1j3......0....1..gws-wiz.....0..0i131.64qdzs_BgpQ')

WebUI.click(findTestObject('Object Repository/Page_katalon studio - Google Search/a_Images'))

WebUI.closeBrowser()

