public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int nextId = 1;

    public Customer() {
        this.id = nextId++;
    }

    public void setId(int id){this.id=id;}
    public int getId(){
        return id;
    }

    public void setStartTime(long startTime){this.startTime=startTime;}
    public long getStartTime(){
        return startTime;
    }

    public void setEndTime(long endTime){this.endTime=endTime;}
    public long getEndTime(){
        return endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
