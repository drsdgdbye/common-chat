package ru.drsdgdby.commonchat.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.drsdgdby.commonchat.services.MessageService;
import ru.drsdgdby.commonchat.services.UserService;

@Controller
@AllArgsConstructor
@RequestMapping(name = "/wall")
public class MainController {
    private final UserService userService;
    private final MessageService messageService;

    @GetMapping(name = "/show")
    public String showAllMessages(Model model) {
        model.addAttribute("messages", messageService.getAllMessages());
        return "";
    }
}
