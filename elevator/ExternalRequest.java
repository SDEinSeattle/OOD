package OOD.elevator;

public class ExternalRequest extends Request {
    private Direction dir;

    public ExternalRequest(int level, Direction dir) {
        super(level);
        this.dir = dir;
    }

    public Direction getDirection() {
        return dir;
    }
}
