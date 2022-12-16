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


// 1

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Login Page (1)/button_Login'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard (1)/div_Office'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard  Offices (1)/h1_(39) Record Found'))

WebUI.delay(2)

WebUI.closeBrowser()

//2

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard/div_Office'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard  Offices/button_Coworking Space_transition-transform_4996ac'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard  Offices/h3_Detail Office'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard  Offices/div_Coworking Space_p-3 mt-1 absolute rounded-t'))

WebUI.click(findTestObject('Object Repository/Offices/View_Offices/Page_Dashboard  Offices/button_Coworking Space_text-gray-400 bg-tra_6060b7'))

WebUI.closeBrowser()
