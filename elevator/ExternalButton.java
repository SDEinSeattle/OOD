package OOD.elevator;

public class ExternalButton extends Button {
    private Elevator elevator;

    private int level;

    public ExternalButton(final Elevator elevator, final int level) {
        this.elevator = elevator;
        this.level = level;
    }

    public void sendUpRequest() {
        elevator.handleExternalRequest(new ExternalRequest(level, Direction.UP));
    }

    public void sendDownRequest() {
        elevator.handleExternalRequest(new ExternalRequest(level, Direction.DOWN));
    }
}
