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

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Username_password'), 
    GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard/div_User'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_deergmail.com_px-2 py-2 font-medium _73ee96'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_Yes, Delete'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_OK'))

WebUI.delay(3)

WebUI.closeBrowser()

// 2

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setEncryptedText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Username_password'),
	GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard/div_User'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/input_deergmail.com_32'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_Delete Selected'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_Yes, Delete'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_OK'))

WebUI.delay(3)

WebUI.closeBrowser()

// 3

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Username_password'),
	GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard/div_User'))

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/input_Search_table-search-users'),
	'Admin')

WebUI.sendKeys(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/input_Search_table-search-users'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_admin3example.com_px-2 py-2 font-med_a993bb'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_Yes, Delete'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_OK'))

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/input_Search_table-search-users'),
	'Admin')

WebUI.sendKeys(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/input_Search_table-search-users'),
	Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.closeBrowser()

// 4

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/input_Username_password'),
	GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard/div_User'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/svg_coba2example.com_MuiSvgIcon-root MuiSvg_911100'))

WebUI.click(findTestObject('Object Repository/Users/Delete_Customer/Page_Dashboard  Users/button_No, cancel'))

WebUI.delay(2)

WebUI.closeBrowser()
