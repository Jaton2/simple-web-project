package cz.sosjh.web.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class IndexController {

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> index(@RequestParam(value = "myName", defaultValue = "World")String myName) {
        return ResponseEntity.ok("<html><body><h1>Hello " + myName + "</h1></body></html>");
    }
}
