package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uc.cech.agrawadv.eventorganizer.dao.ResourceRepository;

@Service
public class ResourceServiceImpl implements ResourceService {
	
	private ResourceRepository resourceRepository;

	@Autowired
	public ResourceServiceImpl(ResourceRepository theResourceRepository) {
		
		resourceRepository = theResourceRepository;
		
	}

	@Override
	public List<Resource> findAll() {
		
		return resourceRepository.findAll();
		
	}

}