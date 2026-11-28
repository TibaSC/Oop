import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events = new PriorityQueue<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent(){
        return events.poll();
    }

    public void printEvents(){
        PriorityQueue<Event> copy = new PriorityQueue<>(events);

        while (!copy.isEmpty()) {
            Event event = copy.poll();
            System.out.println(event.getEventTime()+ ", "+ event.getEventType());
        }
    }
}
