package com.cypher.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cypher.department.entity.Department;
import com.cypher.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repository;

	public Department saveDepartment(Department department) {
		log.info("In saveDepartment method of DepartmentService");
		return repository.save(department);
	}
	
	public Department getDepartment(int id) {
		log.info("In getDepartment method of DepartmentService");
		return repository.findById(id).get();
	}
	
}
