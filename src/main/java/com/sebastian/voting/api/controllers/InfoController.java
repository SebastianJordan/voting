package com.sebastian.voting.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController()
@RequestMapping("/info")
public class InfoController {
    @GetMapping("/")
    public String echo() {
        return "Hello word";
    }
}
