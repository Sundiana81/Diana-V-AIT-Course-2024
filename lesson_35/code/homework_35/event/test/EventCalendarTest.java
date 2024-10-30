package homework_35.event.test;

import homework_35.event.dao.EventImpl;
import homework_35.event.dao.EventCalendar;
import homework_35.event.model.Event;

import java.util.Date;
import java.util.List;

public class EventCalendarTest {
    public static void main(String[] args) {
        // Create an instance of EventCalendar
        EventCalendar eventCalendar = new EventImpl.EventCalendarImpl();

        // Test adding events
        System.out.println("Adding events...");
        eventCalendar.addEvent(new Event(1, "Java Conference", "http://javaconference.com", new java.sql.Date(new Date().getTime())));

        eventCalendar.addEvent(new Event(2, "Music Festival", "http://musicfestival.com", new java.sql.Date(new Date().getTime())));
        eventCalendar.addEvent(new Event(3, "Art Exhibition", "http://artexhibition.com", new java.sql.Date(new Date().getTime())));

        // Test retrieving all events
        System.out.println("All Events:");
        List<Event> allEvents = eventCalendar.getAllEvents();
        for (Event event : allEvents) {
            System.out.println(event);
        }

        // Test finding an event by ID
        System.out.println("Finding event with ID 1...");
        Event foundEvent = eventCalendar.findEventById(1);
        System.out.println("Found Event: " + foundEvent);

        // Test removing an event
        System.out.println("Removing event with ID 1...");
        eventCalendar.removeEvent(1);

        // Test retrieving all events after removal
        System.out.println("All Events after removal:");
        allEvents = eventCalendar.getAllEvents();
        for (Event event : allEvents) {
            System.out.println(event);
        }

        // Test finding an event that no longer exists
        System.out.println("Finding event with ID 1 after removal...");
        Event missingEvent = eventCalendar.findEventById(1);
        if (missingEvent == null) {
            System.out.println("Event with ID 1 not found.");
        }
    }
}
