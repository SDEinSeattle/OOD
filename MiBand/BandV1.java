package OOD.MiBand;

public class BandV1 extends Band {

    private final LEDColor ledColor;

    public BandV1(String id) {
        super(id);
        ledColor = new LEDColor("123");
    }

    public void displayBatteryLife() {
        return;
    }
}
