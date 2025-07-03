package stepDev;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*; //ini perhatikan baik" dalam bikin before after
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Hooks {
    public static AppiumDriver driver;

    @Before
    public static void openApk() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "emulator-5554"); // Ganti dengan nama device Android Anda (misalnya, "emulator-5554" atau nama perangkat fisik)
        capabilities.setCapability("appium:noReset", true);
        capabilities.setCapability("appium:appActivity", "com.socialnmobile.colornote.activity.Main");
        capabilities.setCapability("appium:appPackage", "com.socialnmobile.dictapps.notepad.color.note");
        capabilities.setCapability("appium:automationName", "uiautomator2");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Memberikan waktu tunggu eksplisit

        System.out.println("Aplikasi ColorNote berhasil dibuka.");
    }

    @After
    public static void closeApk() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Aplikasi ditutup");

    }

}
