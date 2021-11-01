package edu.uc.cech.agrawadv.eventorganizer.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import edu.uc.cech.agrawadv.eventorganizer.resource.Resource;
import edu.uc.cech.agrawadv.eventorganizer.user.User;

public class Event {
	
	private UUID resourceId;
	private String name;
	private String description;	
	
	private Set<User> organizers = new HashSet<>();
	private Set<User> participants = new HashSet<>();
	private Set<Resource> resources = new HashSet<>();
	
	public Event(String name, String description, User creator) {		
		this.resourceId = UUID.randomUUID();
        this.name = name;
        this.description = description;
        organizers.add(creator);
	}
	
	
	public UUID getResourceId() {
		return resourceId;
	}	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	

	public void addResource(Resource r){
    	resources.add(r);  
    	for(User participant : participants) 
		{    		
			participant.notify(r);
		}  	
    }	
	
	public void addParticipant(User user) {
		participants.add(user);
		for(Resource resource : resources) 
		{			
			user.addEvent(this.getResourceId());
		}		
	}

	public void addOrganizer(User o) {
		organizers.add(o);
	}
	
	
	public Set<User> getOrganizers() {
		return organizers;
	}
	
	public Set<User> getParticipants() {
		return participants;
	}


	public Set<Resource> getResources() {
		return resources;
	}
	
	//Only called by users with unsubscribeEvent, never by organizers
	public void removeParticipant(UUID userID)
	{
		Optional<User> user = participants.stream().filter(u -> u.getUserId().equals(userID)).findFirst();
		if(user.isPresent())
		{
			participants.remove(user);
		}
	}	
	

	
	
	

}
