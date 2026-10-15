package sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.service.SampleService;

@RestController
@RequestMapping("/jenkins")
public class SampleController {
	@Autowired
	SampleService service;
	
	@PostMapping
	public String add(@RequestParam String str) {
		return service.add(str);
	}
	
	@GetMapping
	public List<String> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{str}")
	public String findString(@PathVariable String str) {
		return service.findString(str);
	}
	
}
