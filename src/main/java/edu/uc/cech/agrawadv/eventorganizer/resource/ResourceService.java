package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.List;
import java.util.Optional;

public interface ResourceService {
    List<Resource> findAll();
    Optional<Resource> findResource(int resourceId);
    void saveResource(Resource resource);
}
