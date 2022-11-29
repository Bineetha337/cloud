package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudRun {
@GetMapping("/run")
private String run() {
	return "Running";
}
}
