package edu.uc.cech.agrawadv.eventorganizer.resource;


import java.util.HashMap;
import java.util.UUID;

public class ResourceService {
    private HashMap<UUID, Resource> resources = new HashMap<>();

    Resource findResource(UUID resourceId) {
        return resources.get(resourceId);
    }

    void saveResource(Resource resource) {
        resources.put(resource.getResourceId(), resource);
    }
}
