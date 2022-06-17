package com.cypher.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cypher.user.entity.User;
import com.cypher.user.service.UserService;
import com.cypher.user.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		System.out.println(user.getFirstName());
		log.info("In addUser method of UserController");
		return service.addUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable int id ) {
		log.info("In getUserWithDepartment method of UserController");
		return service.getUserWithDepartment(id);
	}
	
}
