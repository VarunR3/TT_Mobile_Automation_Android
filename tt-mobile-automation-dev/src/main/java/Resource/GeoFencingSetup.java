package Resource;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.html5.Location;

public class GeoFencingSetup {
    private AppiumDriver<MobileElement> driver;
    private static double latitude= 45.517910;
    private static double longitude = -73.582320;
    private static double altitude = 1;

    private static double outRangeLatitude = 20.517910;
    private static double outRangeLongitude = 10.582320;


    public GeoFencingSetup(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void setLocation() {
        //location for the Site Location
        //45.517910   //-73.582320
        driver.setLocation(new Location(latitude,longitude,altitude));
    }

    public void setOutRangeLocation() {
        //out-Range Location for not allowed to sign in
        driver.setLocation(new Location(outRangeLatitude, outRangeLongitude, altitude));
    }
}
