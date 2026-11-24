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

    public void setStartTime(){
        startTime= System.nanoTime();
    }
    public long getStartTime(){
        return startTime;
    }

    public void setEndTime(){
        endTime = System.nanoTime();}
    public long getEndTime(){
        return endTime;
    }

    public long getTimeSpent() {
        return (endTime - startTime)/1000000000;
    }
}
