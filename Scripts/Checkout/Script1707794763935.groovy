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

Mobile.startApplication('C:\\Users\\rizky\\Documents\\Android-Solodroid_E-CommerceApp Demo_3.2.0.apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Add to Chart/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Add to Chart/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/Add to Chart/android.widget.EditText'), '2', 0)

Mobile.tap(findTestObject('Object Repository/Add to Chart/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.ImageButton (1)'),0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Your Name'), 'Fariz', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - your.emailgmail.com'), 'Fariz@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Your Address'), 'Rukita sama kamu', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.Button - YES'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/Tombol OK'))

//Mobile.closeApplication()

