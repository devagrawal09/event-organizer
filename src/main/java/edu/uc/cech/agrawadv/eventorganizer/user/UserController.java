package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	public UserService userService;

	public UserController(UserService theUserService) {
		userService = theUserService;
	}

	@GetMapping("/all")
	public String listFaculties(Model theModel) {

		// get faculty from db
		List<User> theUsers = userService.findAll();

		// add faculties to the spring model
		theModel.addAttribute("user", theUsers);

		return "index";
	}

}
