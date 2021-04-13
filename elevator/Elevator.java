package OOD.elevator;

import java.util.List;
import java.util.PriorityQueue;


public class Elevator {
    private String id;

    private int capacity;

    private int currentLevel;

    private Direction currentDirection;

    private List<InternalButton> internalButtonList;

    private List<ExternalButton> externalButtonList;

    private PriorityQueue<Integer> upTasks;

    private PriorityQueue<Integer> downTasks;

    public boolean handleExternalRequest(ExternalRequest external) {
        /*
        * checkValue(request)
        * */

        int currLevel = external.getLevel();
        Direction requestDirection = external.getDirection();

        if (requestDirection == Direction.UP) {
            if (currLevel > currentLevel && currentDirection == Direction.UP) {
                upTasks.offer(currLevel);
                return true;
            }
        } else if (requestDirection == Direction.DOWN) {
            if (currLevel < currentLevel && currentDirection == Direction.DOWN) {
                downTasks.offer(currLevel);
                return true;
            }
        }

        return false;
    }

    public boolean handleInternalRequest(InternalRequest internal) {
        // corner case

        Integer requestLevel = internal.getLevel();
        if (requestLevel > currentLevel && currentDirection == Direction.valueOf("UP")) {
            upTasks.offer(requestLevel);
            return true;
        } else if (requestLevel < currentLevel && currentDirection == Direction.valueOf("DOWN")){
            downTasks.offer(requestLevel);
            return true;
        }

        return false;
    }

}
