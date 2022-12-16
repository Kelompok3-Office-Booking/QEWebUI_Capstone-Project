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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.click(findTestObject('Object Repository/Offices/Search_Offices/Page_Dashboard/div_Office'))

WebUI.setText(findTestObject('Object Repository/Offices/Search_Offices/Page_Dashboard  Offices/input_Search_table-search-users'), 
    'suropati')

WebUI.click(findTestObject('Object Repository/Offices/Search_Offices/Page_Dashboard  Offices/td_Update Suropati Space'))

WebUI.click(findTestObject('Object Repository/Offices/Search_Offices/Page_Dashboard  Offices/td_Suropati Space'))

WebUI.click(findTestObject('Object Repository/Offices/Search_Offices/Page_Dashboard  Offices/td_Suropati Space'))

WebUI.closeBrowser()

