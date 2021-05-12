package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public AppiumDriver<MobileElement> driver;

    public BasePage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }
}
