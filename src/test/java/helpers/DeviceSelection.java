package helpers;

import drivers.BrowserstackMobileDriver;
import drivers.EmulatorMobileDriver;
import drivers.RealMobileDriver;

public class DeviceSelection {
    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "emulation":
                return EmulatorMobileDriver.class.getName();
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();
            case "realmobile":
                return RealMobileDriver.class.getName();


            default:
                throw new RuntimeException("Please select only " +
                        "emulation / browserstack / realmobile /-DdeviceHost parameter");
        }
    }
}
