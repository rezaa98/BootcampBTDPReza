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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/input_Username_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/label_None'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/td_9'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'tes1')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_Make Appointment_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/td_5'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'gest2')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_History'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()

