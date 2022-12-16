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

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Better Space/a_BETTER SPACE'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Welcome Admin,_email'), GlobalVariable.nameAdmin)

WebUI.setText(findTestObject('Object Repository/Login/Page_Better Space/input_Username_password'), GlobalVariable.passAdmin)

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard/div_Office'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/a_Add'))

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Office ID_title'), 
    'GoWork')

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Office_office_type'))

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Meeting Room_price'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/label_Accommodate'))

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Save_accommodate'), 
    '1')

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/label_Working Desk'))

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Person_working_desk'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Desk_meeting_room'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Room_private_room'), 
    '1')

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Price(Rp)_inline-radio'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/label_Length'))

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Close_office_length'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Length_description'), 
    'tempatnya bagus')

WebUI.setText(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Description_address'), 
    'jln soekarno hatta')

WebUI.doubleClick(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Address_lat'))

WebUI.doubleClick(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Latitude_lng'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Latitude_lng'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Room_facilities_id'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/input_Room_facilities_id'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/div_Click to upload or drag and dropJPG or _ae035c'))

WebUI.click(findTestObject('Object Repository/Offices/Create_Offices/Page_Dashboard  Offices/button_Save'))

WebUI.closeBrowser()

