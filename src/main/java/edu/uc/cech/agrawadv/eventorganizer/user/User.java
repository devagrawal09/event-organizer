package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import edu.uc.cech.agrawadv.eventorganizer.event.Event;
import edu.uc.cech.agrawadv.eventorganizer.event.EventService;
import edu.uc.cech.agrawadv.eventorganizer.resource.Resource;

public class User {
	
    private UUID userId;
    private String name;
    private String username;
    private String password;       
    
    private Set<UUID> subscribedEvents = new HashSet<>();
    
    //Replaces role, users can be both participants and organizers
    private Set<UUID> ownedEvents = new HashSet<>();
    

    public User(String name, String username, String password) {
        this.userId = UUID.randomUUID();
        this.name = name;
        this.username = username;
        this.password = password;        
    }    

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }    

    public Boolean checkPassword(String attempt) {
        return password.equals(attempt);
    }    
    

	public Set<UUID> getSubscribedEvents() {
		return subscribedEvents;
	}
	
	public void addEvent(UUID event) {
		subscribedEvents.add(event);
    }	
	
	public void unsubscribeEvent(UUID eventID) {
		Optional<UUID> targetEvent = subscribedEvents.stream().filter(id -> id.equals(eventID)).findFirst();
		if(targetEvent.isPresent())
		{			
			//Ping the event service and remove this user from the matching event
			
			//Remove event
			subscribedEvents.remove(targetEvent);
		}
			
    }
	
	public void notify(Resource r)
	{
		//Just dummy code, this would be hooked up to a notification system
		System.out.println(r.toString());
	}
	
	
	public Set<UUID> getOwnedEvents() {
		return ownedEvents;
	}
	
	public void addOwnedEvent(UUID eventID) {
		ownedEvents.add(eventID);
	}
    
    
    
    
}
