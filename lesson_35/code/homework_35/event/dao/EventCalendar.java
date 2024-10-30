package homework_35.event.dao;

import homework_35.event.model.Event;

import java.util.List;

public interface EventCalendar {

    void addEvent(Event event);
    void removeEvent(int id);
    List<Event> getAllEvents();
    Event findEventById(int id);

}
