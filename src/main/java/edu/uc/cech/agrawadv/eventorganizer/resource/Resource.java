package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.UUID;

import edu.uc.cech.agrawadv.eventorganizer.event.Event;

public class Resource {	
	
    private UUID resourceId;
    private String title;
    private String description;

    public Resource(String title, String description) {
        this.resourceId = UUID.randomUUID();
        this.title = title;
        this.description = description;
    }    

    public UUID getResourceId() {
        return resourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
