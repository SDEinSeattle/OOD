package OOD.MiBand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BandV3 extends Band{
    private final Screen screen;
    List<DisplayHardware> hardwares;

    Map<DisplayOption, Screen> hardwareMap;

    public BandV3(String id) {
        super(id);
        screen = new Screen();
        hardwares = new ArrayList<DisplayHardware>();
    }

    public void addHardware(DisplayHardware hardware) {
        hardwares.add(hardware);
    }

    public void displayBatteryLife() {
        screen.displayBattery(getBatteryLife());
    }

    public void displayBatteryLife(DisplayOption option) throws DeviceNotSupportException {
        DisplayHardware hardware = hardwareMap.get(option);

        if (hardware != null) {
            screen.displayBattery(getBatteryLife());
        } else {
            throw new DeviceNotSupportException("The device is not support.");
        }

        return;
    }
}
