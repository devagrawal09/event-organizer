package edu.uc.cech.agrawadv.eventorganizer.resource;


import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public interface ResourceService {
	
    HashMap<UUID, Resource> resources = new HashMap<>();

    static Resource findResource(UUID resourceId) {
    	
        return resources.get(resourceId);
        
    }

    static void saveResource(Resource resource) {
        //TODO
    }

	List<Resource> findAll();
}
