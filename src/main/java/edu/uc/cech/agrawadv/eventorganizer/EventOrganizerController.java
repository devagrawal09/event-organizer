package edu.uc.cech.agrawadv.eventorganizer;

import java.util.List;
import org.springframework.stereotype.Controller;

import edu.uc.cech.agrawadv.eventorganizer.resource.*;
import edu.uc.cech.agrawadv.eventorganizer.user.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller()
@RequestMapping("/")
public class EventOrganizerController {
    public UserService userService;
    public ResourceService resourceService;

    public EventOrganizerController(UserService userService, ResourceService resourceService) {
        this.userService = userService;
        this.resourceService = resourceService;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<User> users = userService.findAll();
        List<Resource> resources = resourceService.findAll();

        model.addAttribute("users", users);
        model.addAttribute("resources", resources);

        return "index";
    }

    @GetMapping("/new-user")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new-user";
    }

    @PostMapping("/new-user")
    public String newUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/new-resource")
    public String newResource(Model model) {
        model.addAttribute("resource", new Resource());
        return "new-resource";
    }

    @PostMapping("/new-resource")
    public String newResource(@ModelAttribute("resource") Resource resource) {
        resourceService.saveResource(resource);
        return "redirect:/";
    }
}
