package utils;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class MobileDriver {


    @SneakyThrows
    public static AppiumDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MI CC 9e");
//        cap.setCapability("udid", "6723419ed0d9");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10 QKQ1.190910.002");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 5");
        cap.setCapability("udid", "c6246c1c7cf5");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.wordappsystem.YourGroceryStoreName.debug");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wordappsystem.localexpress.ui.activities.splash.SplashActivity");
        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        return new AndroidDriver<MobileElement>(url, cap);
    }
}
