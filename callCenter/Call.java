package OOD.callCenter;

public class Call {
    private Rank rank;

    private Caller caller;

    private Employee handler;

    public Call(Caller c) {
        rank = Rank.Respondent;
        caller = c;
    }

    public void setHandler(Employee e) {
        handler = e;
    }

    public void reply(String message) {

    }

    public int getRank() {
        return rank;
    }

    public void setRank(Rank r) {
        rank = r;
    }

    public Rank incrementRank() {
       return rank;
    }

}
