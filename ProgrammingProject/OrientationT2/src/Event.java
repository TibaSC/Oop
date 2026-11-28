public class Event implements Comparable<Event>{

    private double eventTime;

    public Event(double eventTime){
        this.eventTime= eventTime;
    }

    public double getEventTime(){
        return eventTime;
    }

    public int compareTo(Event e){
        return Double.compare(this.eventTime, e.eventTime);
    }
}
