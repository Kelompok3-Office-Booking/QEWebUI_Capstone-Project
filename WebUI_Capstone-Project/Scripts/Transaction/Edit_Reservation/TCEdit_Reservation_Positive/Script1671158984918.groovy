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

//1
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://betterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard/div_Transaction'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/button_Cancelled_px-2 py-2 font-medium bg-s_c24eb1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/select_AcceptedRejectedPendingOn Process'), 
    'pending', true)

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/button_Save'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/span_Pending'))

WebUI.closeBrowser()

// 2
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://betterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard/div_Transaction'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/button_Pending_px-2 py-2 font-medium bg-sla_1a7cb4'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/button_Reset'))

WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/svg_Pending_w-5 h-5'))

WebUI.closeBrowser()

// 3
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://betterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard/div_Transaction'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/svg_Pending_MuiSvgIcon-root MuiSvgIcon-font_6a796f'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/input_Edit Transaction_full_name'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/input_Edit Transaction_full_name'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/input_Full Name_type'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/input_Date_status'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/select_AcceptedRejectedPendingOn Process'),
	'on process', true)

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/button_Save'))

WebUI.click(findTestObject('Object Repository/Transaction/Edit_Reservation/Page_Dashboard  Transactions/span_On Process'))

WebUI.closeBrowser()