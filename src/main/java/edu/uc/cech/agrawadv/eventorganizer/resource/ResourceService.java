package edu.uc.cech.agrawadv.eventorganizer.resource;


import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import edu.uc.cech.agrawadv.eventorganizer.user.User;

public class ResourceService {
	
    private HashMap<UUID, Resource> resources = new HashMap<>();

    Resource findResource(UUID resourceId) {
        return resources.get(resourceId);
    }
    
    Optional<Resource> findResourceByTitle(String title) {
        return resources
                .values()
                .stream()
                .filter(resource -> resource.getTitle().equals(title))
                .findFirst();
    }

    void saveResource(Resource resource) {
        resources.put(resource.getResourceId(), resource);
    }
    
    
}
