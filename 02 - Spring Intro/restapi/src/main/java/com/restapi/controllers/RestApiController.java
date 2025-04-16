package com.restapi.controllers;

import com.restapi.dtos.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/query")
    public String query(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/param/{name}")
    public String param(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping("/post")
    public String post(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName();
    }
}
