package edu.uc.cech.agrawadv.eventorganizer.event;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

public class EventService {
	private static HashMap<UUID, Event> events = new HashMap<>();

    public static Event findEvent(UUID eventId) {
        return events.get(eventId);
    }
    
    public static Optional<Event> findEventByName(String name) {
        return events
                .values()
                .stream()
                .filter(event -> event.getName().equals(name))
                .findFirst();
    }

    public static void saveEvent(Event event) {
    	events.put(event.getResourceId(), event);
    }
}
