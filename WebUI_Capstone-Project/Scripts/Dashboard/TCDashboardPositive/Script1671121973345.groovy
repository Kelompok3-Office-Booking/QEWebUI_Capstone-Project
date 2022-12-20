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

WebUI.navigateToUrl('https://betterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_30Users12 Users joined this week'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_303Office20 Offices Add this week'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_1.403Transaction100 Transaction this week'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_303Review12 Review Added this week'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_Transaction Chart12 - 18 Desember 2022W_cc97a8'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_Total Office'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_Recent Status BookingDateNameTypeOffice_bf5ae8'))

WebUI.click(findTestObject('Object Repository/Dashboard/Page_Better Space/div_Top Value TransactionPhotoNamePriceOffi_e2dc24'))

WebUI.delay(2)

WebUI.closeBrowser()


