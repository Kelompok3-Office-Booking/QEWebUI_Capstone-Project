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

// 2

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), '')

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), '')

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.delay(5)

WebUI.closeBrowser()

// 3

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), '')

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.delay(5)

WebUI.closeBrowser()

// 4

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), '')

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.delay(5)

WebUI.closeBrowser()

// 5

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.invalidName)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.delay(5)

WebUI.closeBrowser()

// 6

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ucbetterspace.netlify.app/')

WebUI.click(findTestObject('Object Repository/OnBoarding/Page_Better Space/a_BETTER SPACE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.invalidPass)

WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))

WebUI.delay(5)

WebUI.closeBrowser()



//int x = findTestData('Login').getRowNumbers()
//
//for (i = 1; i <= x; i++) {
//
//	WebUI.openBrowser('')
//
//	WebUI.maximizeWindow()
//
//	WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//	WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)
//
//	WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), findTestData('Login').getValue(1, i))
//
//
//	WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), findTestData('Login').getValue(1, i))
//
//	WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))
//
//	WebUI.delay(5)
//
//	WebUI.closeBrowser()
//
//}


//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://ucbetterspace.netlify.app/login')
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Better Space/button_Login'), 0)
//
////WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), findTestData('Login2').getValue(1, i))
//
//WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), '')
//
////WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), findTestData('Login2').getValue(1, i))
//
//WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), '')
//
//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_Login'))
//
//WebUI.delay(5)
//
//WebUI.closeBrowser()


//WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), '/5S6MFFLcE47TFgtSVsT0Q==')

//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/div_FailedUsername or Password is WrongOKNoCancel'))
//
//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/button_OK'))

//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/div_Login SuccessOKNoCancel'))
//
//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/h4_BETTER SPACE'))
//
//WebUI.click(findTestObject('Object Repository/Login/Page_Better Space/div_BETTER SPACE'))