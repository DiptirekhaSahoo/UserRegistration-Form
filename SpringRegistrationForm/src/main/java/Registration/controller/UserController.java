package Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import Registration.entity.User;
import Registration.service.Userinterface;

@Controller
public class UserController {

    @Autowired
    private Userinterface userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        // Save user to DB (optional validation logic can go here)
        userService.saveUser(user);
        return "redirect:/home"; // after successful registration
    }

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/")
    public String redirectToRegister() {
        return "redirect:/register";
    }
}
