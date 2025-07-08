package stepDev;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Hooks {
    public static AndroidDriver driver;

    @Before
    public static void openApk() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "RRCW603WLDR"); // Ganti dengan nama device Android Anda (misalnya, "emulator-5554" atau nama perangkat fisik)
        capabilities.setCapability("appium:noReset", true);
        capabilities.setCapability("appium:appActivity", "com.socialnmobile.colornote.activity.Main");
        capabilities.setCapability("appium:appPackage", "com.socialnmobile.dictapps.notepad.color.note");
        capabilities.setCapability("appium:automationName", "uiautomator2");

        // driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities); //( appium v.2)
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Memberikan waktu tunggu eksplisit

        System.out.println("Aplikasi ColorNote berhasil dibuka.");
    }

    @After
    public static void closeApk() throws InterruptedException {
        if (driver != null) {
            driver.terminateApp("com.socialnmobile.dictapps.notepad.color.note");
            driver.quit();
            System.out.println("Aplikasi ditutup");
        } else {
            System.out.println("Driver sudah null, tidak ada aplikasi yang ditutup.");
        }
    }
}
