package com.cypher.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cypher.department.entity.Department;
import com.cypher.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("In saveDepartment method of DepartmentController");
		return  service.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable int id) {
		log.info("In getDepartment method of DepartmentController");
		return service.getDepartment(id);
	}
}
