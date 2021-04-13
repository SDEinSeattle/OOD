package OOD.elevator;

public class InternalButton extends Button {
    private Elevator elevator;

    private int level;;

    public InternalButton(final Elevator elevator, final int level) {
        this.elevator = elevator;
        this.level = level;
    }

    public void sendRequest() {
        elevator.handleInternalRequest(new InternalRequest(level));
    }
}
