public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(10));
        eventList.addEvent(new Event(4));
        eventList.addEvent(new Event(7));
        eventList.addEvent(new Event(2));

        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next event: " + nextEvent.getEventTime());
        System.out.println("Remaining events:");
        eventList.printEvents();
    }
}
