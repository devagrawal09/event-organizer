package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.UUID;

public class Resource {
	
    private UUID resourceId;
    private String title;
    private String description;

    //Didn't include ID in parameter so the resource is assigned with an ID
    public Resource(String title, String description) {
        this.resourceId = UUID.randomUUID();
        this.title = title;
        this.description = description;
    }
    
    //Where user already has resourceID?
    public Resource(UUID resourceId, String title, String description) {
        this.resourceId = resourceId;
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
