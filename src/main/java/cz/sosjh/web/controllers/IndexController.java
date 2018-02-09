package cz.sosjh.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class IndexController {

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(@RequestParam(value = "myName", defaultValue = "World")String myName, Model model) {
        model.addAttribute("name", myName);
        return "index";
    }
}
