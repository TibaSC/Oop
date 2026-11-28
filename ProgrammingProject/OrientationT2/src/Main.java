public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(10, EventType.ARRIVAL));
        eventList.addEvent(new Event(4, EventType.EXIT));
        eventList.addEvent(new Event(7, EventType.ARRIVAL));
        eventList.addEvent(new Event(2, EventType.EXIT));

        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next event: " + nextEvent.getEventTime() + ", " + nextEvent.getEventType());
        System.out.println("Remaining events:");
        eventList.printEvents();
    }
}
