import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.MobileDriver;

import java.time.Duration;

@Test
public class LoginTest {

    AppiumDriver<MobileElement> appiumDriver = MobileDriver.getDriver();

    @SneakyThrows
    public void loginTest() {
        Thread.sleep(10000);

        MobileElement moreList = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/store_list_more_view"));
        moreList.click();

        Thread.sleep(5000);

//        MobileElement signInButton = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/loginButton"));
//        signInButton.click();

        MobileElement register = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/signUpTextView"));
        register.click();
        Thread.sleep(10000);

        TouchAction<?> touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(100,1000))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(20,20))
                .release()
                .perform();

        MobileElement name = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/firstNameEdittext"));
        name.setValue("And");
        MobileElement surName = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/lastNameEdittext"));
        surName.setValue("Sarg");
        MobileElement email = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/emailEdittext"));
        email.setValue("www@Gmail.com");

        MobileElement phone = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/phoneEdittext"));
        phone.setValue("37494714348");

        MobileElement password = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/passwordEdittext"));
        password.setValue("A11111111a");
        MobileElement confirmPassword = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/confirmPasswordEdittext"));
        confirmPassword.setValue("A11111111a");
        MobileElement signUp = appiumDriver.findElement(By.id("com.wordappsystem.YourGroceryStoreName.debug:id/signUpButton"));
        signUp.click();

    }

}
