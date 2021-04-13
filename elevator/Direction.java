package OOD.elevator;

public enum Direction {
    UP("UP"),
    DOWN("DOWN"),
    STOP("STOP");

    private final String direction;

    Direction(String dir) {
        this.direction = dir;
    }

    public String getDirection() {
        return direction;
    }

}
