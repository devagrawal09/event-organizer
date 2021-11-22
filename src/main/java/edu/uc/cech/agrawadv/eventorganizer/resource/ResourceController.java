package edu.uc.cech.agrawadv.eventorganizer.resource;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class ResourceController {

	public ResourceService resourceService;

	public ResourceController(ResourceService theResourceService) {
		resourceService = theResourceService;
	}

	@GetMapping("/all")
	public String listFaculties(Model theModel) {

		// get faculty from database
		List<Resource> theResources = resourceService.findAll();

		// add faculties to the spring model
		theModel.addAttribute("resource", theResources);

		return "index";
	}
}
