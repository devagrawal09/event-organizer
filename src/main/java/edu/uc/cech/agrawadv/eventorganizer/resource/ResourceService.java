package edu.uc.cech.agrawadv.eventorganizer.resource;


import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public interface ResourceService {
    public static HashMap<UUID, Resource> resources = new HashMap<>();

    public static Resource findResource(UUID resourceId) {
        return resources.get(resourceId);
    }

    public static void saveResource(Resource resource) {
        //TODO
    }

	public List<Resource> findAll();
}
