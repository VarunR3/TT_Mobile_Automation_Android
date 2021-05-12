package Resource;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImportPicture {
    private String  PLATFORM_NAME;
    private AppiumDriver<MobileElement> driver;
    private static String ANDROID_PHOTO_PATH = "/mnt/sdcard/Pictures";
    private static String IOS_PHOTO_PATH = "";
    public ImportPicture(AppiumDriver<MobileElement> driver, String platformName){
        this.driver= driver;
        this.PLATFORM_NAME = platformName;
    }

    public void importPictureLocally() throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream initialStream = classloader.getResourceAsStream("test_picture.jpeg");
        File targetFile = new File("resources/test_picture.jpeg");
        FileUtils.copyInputStreamToFile(initialStream, targetFile);
        //((AndroidDriver)driver).pushFile(ANDROID_PHOTO_PATH + "/" + targetFile.getName(), targetFile);
        if (PLATFORM_NAME.equals("Android"))
        {
            ((AndroidDriver)driver).pushFile(ANDROID_PHOTO_PATH + "/" + targetFile.getName(), targetFile);
        }
       else
        {
            ((IOSDriver)driver).pushFile(IOS_PHOTO_PATH + "/" + targetFile.getName(), targetFile);
        }
    }
}
