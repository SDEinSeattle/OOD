package OOD.MiBand;

public class LEDColor implements DisplayHardware {
    private final String equipId;

    public LEDColor(final String id) {
        equipId = id;
    }

    public void displayBatteryLife(final int num) {
        if (num > 80) {
            System.out.println("WHITE");
        } else if (num > 60) {
            System.out.println("BLUE");
        }
    }
}
