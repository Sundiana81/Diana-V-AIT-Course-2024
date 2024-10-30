package homework_35.event.dao;

import homework_35.event.model.Event;

import java.util.ArrayList;
import java.util.List;

public  class EventImpl {

    public static class EventCalendarImpl implements EventCalendar {
        private List<Event> events = new ArrayList<>();

        @Override
        public void addEvent(Event event) {
            events.add(event);
        }


        @Override
        public void removeEvent(int id) {
            events.removeIf(event -> event.getId() == id);
        }

        @Override
        public List<Event> getAllEvents() {
            return new ArrayList<>(events); // Return a copy to avoid external modification
        }

        @Override
        public Event findEventById(int id) {
            for (Event event : events) {
                if (event.getId() == id) {
                    return event; // Return the found event
                }
            }
            return null; // Return null if no event is found
        }
    }
}
