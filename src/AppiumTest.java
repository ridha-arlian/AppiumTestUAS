import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class AppiumTest extends BaseAppium {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();

//        driver.findElementById("com.example.calculator:id/operan_1").sendKeys("1");
        driver.findElementById("com.example.mycalculator:id/num7").click();
        
        driver.findElementById("com.example.mycalculator:id/num5").click();
        
        driver.findElementById("com.example.mycalculator:id/num3").click();
        
        driver.findElementById("com.example.mycalculator:id/num8").click();
        
        driver.findElementById("com.example.mycalculator:id/actionAdd").click();
        
        driver.findElementById("com.example.mycalculator:id/num9").click(); 
        
        driver.findElementById("com.example.mycalculator:id/num2").click();

        driver.findElementById("com.example.mycalculator:id/num5").click();

        driver.findElementById("com.example.mycalculator:id/num1").click();

        driver.findElementById("com.example.mycalculator:id/actionEquals").click();
        
        driver.findElementById("com.example.mycalculator:id/clear").click();
        
        driver.findElementById("com.example.mycalculator:id/num4").click();
        
        driver.findElementById("com.example.mycalculator:id/num9").click();
        
        driver.findElementById("com.example.mycalculator:id/num0").click();
        
        driver.findElementById("com.example.mycalculator:id/num7").click();
        
        driver.findElementById("com.example.mycalculator:id/actionAdd").click();
        
        driver.findElementById("com.example.mycalculator:id/actionEquals").click();
        
        Thread.sleep(5000);
        
        driver.findElementById("com.example.mycalculator:id/clear").click();
        

    }
}
