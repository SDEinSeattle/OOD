package OOD.callCenter;

import java.util.List;

public class CallHandler {

    private final int LEVELS = 3;

    private final int numberRespondent = 10;
    private final int numberManager = 4;
    private final int numberDirectors = 2;

    List<List<Employee>> employeeLevels;

    List<List<Call>> callQueues;

    public CallHandler() {

    }

    public Employee getHandlerForCall(Call call) {
        return employeeLevels.get(0).get(0);
    }

    public void dispatchCall(Caller caller) {
        Call call = new Call(caller);
        // dispatchCall(call);
    }

    public void dispathCal(Call call) {
        Employee emp = getHandlerForCall(call);
        if (emp == null) {
            emp.receiveCall(call);
            call.setHandler(emp);
        } else {
            call.reply("Please wait for free employee to reply");
            callQueues.get(call.getRank()).add(call);
        }
    }
}
