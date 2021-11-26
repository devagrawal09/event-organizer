package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uc.cech.agrawadv.eventorganizer.dao.ResourceRepository;

@Service
public class ResourceServiceImpl implements ResourceService {
	private ResourceRepository resourceRepository;

	@Autowired
	public ResourceServiceImpl(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}

	@Override
	public List<Resource> findAll() {
		return resourceRepository.findAll();
	}

	@Override
	public Optional<Resource> findResource(int resourceId) {
		return resourceRepository.findById(resourceId);
	}

	@Override
	public void saveResource(Resource resource) {
		resourceRepository.save(resource);
	}

}