package OOD.MiBand;

public abstract class Band {

    // deveice serial number
    private final String deviceSerialNumber;

    // int 0-100 percent
    private int BatteryLife;

    public Band(final String id) {
        deviceSerialNumber = id;
    }

    public String getId() {
        return deviceSerialNumber;
    }

    public int getBatteryLife() {
        return getBatteryLife();
    }

    public abstract void displayBatteryLife();
}
