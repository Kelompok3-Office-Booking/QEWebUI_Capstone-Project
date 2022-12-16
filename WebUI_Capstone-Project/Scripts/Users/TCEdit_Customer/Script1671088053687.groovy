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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Username_password'), 
//    GlobalVariable.passAdmin)
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard/div_User'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_admin1gmail.com_px-2 py-2 font-mediu_453988'))
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/input_Edit User_full_name'), 'Deer Aja')
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_OK'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/td_Deer Aja'))
//
//WebUI.closeBrowser()

// 2

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Username_password'),
//	 GlobalVariable.passAdmin)
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard/div_User'))
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/input_Search_table-search-users'),
//	'Deer')
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_admin1gmail.com_px-2 py-2 font-mediu_453988'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/select_MaleFemale'),
//	'female', true)
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_OK'))
//
//WebUI.closeBrowser()

// 3

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Username_password'),
//	GlobalVariable.passAdmin)
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard/div_User'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/input_Action_6'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_admin1gmail.com_px-2 py-2 font-mediu_453988'))
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/input_Edit User_full_name'), 'Deer')
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_OK'))
//
//WebUI.closeBrowser()

// 4

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Username_password'),
	GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard/div_User'))

WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_admin1gmail.com_px-2 py-2 font-mediu_453988'))

WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/input_Edit User_full_name'), 'Deer Ajah')

WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/svg'))

WebUI.delay(3)

WebUI.closeBrowser()

// 5

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)
//
//WebUI.setText(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/input_Username_password'),
//	GlobalVariable.passAdmin)
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Login Page/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard/div_User'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_admin1gmail.com_px-2 py-2 font-mediu_453988'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/Users/Edit_Customer/Page_Dashboard  Users/button_OK'))
//
//WebUI.closeBrowser()


