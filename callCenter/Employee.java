package OOD.callCenter;

public abstract class Employee {
    private Call curentCall = null;

    protected Rank rank;

    public Employee() {

    }

    public Employee(CallHandler handler) {

    }

    public void receiveCall(Call call) {

    }

    public void completeCall() {

    }

    public void escalateAndReassign() {

    }

    public boolean assignNewCall() {
        return false;
    }

    public boolean isFree() {
        return curentCall == null;
    }

    public Rank getRank() {
        return rank;
    }
}
