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

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard/div_Transaction'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_1'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_2'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_3'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_4'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_5'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_6'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_8'))

WebUI.click(findTestObject('Object Repository/Transaction/Filter_Reservation1/Page_Dashboard  Transactions/a_9'))

WebUI.closeBrowser()

