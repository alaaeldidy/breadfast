package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;




public class Mobile {

public static AndroidDriver <WebElement> driver;	
	
@BeforeTest
public void useropenapp() throws MalformedURLException
{
DesiredCapabilities caps = new 	DesiredCapabilities();
caps.setCapability("automationName","Appium");
caps.setCapability("platformName","Android");
caps.setCapability("platformVersion","8.1");
caps.setCapability("deviceName","Nexus5X"); 
caps.setCapability("app","C:\\Users\\alaa.eldiddy\\Downloads\\Breadfast.apk");
caps.setCapability("appActivity","com.breadfast.MainActivity");
caps.setCapability("appPackage","com.breadfast");



driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

}
	
@Test
public void usertestapp() throws InterruptedException
{
	Thread.sleep(4000);
	WebElement Englishbtn=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"en\"]"));
	Englishbtn.click();
	WebElement contbtn=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]/android.view.ViewGroup"));
	contbtn.click();
	WebElement skip=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Skip_btn\"]/android.widget.TextView"));
	skip.click();
	WebElement shop=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Let’s Shop!\"]/android.view.ViewGroup"));
	shop.click();
	WebElement Deny1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	Deny1.click();
	Thread.sleep(2000);
	WebElement Deny2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	Deny2.click();
	WebElement proceed=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));
	proceed.click();
	WebElement confirm=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"CONFIRM LOCATION\"]/android.widget.TextView"));
	confirm.click();
	
	  driver.findElement(MobileBy.AndroidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2000)"));
	
}
	
	
	
@AfterMethod
public void closeapp()
{
	  driver.quit(); 
}	
	
	
	
}
