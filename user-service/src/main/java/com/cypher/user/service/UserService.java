package com.cypher.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cypher.user.entity.User;
import com.cypher.user.repository.UserRepository;
import com.cypher.user.vo.Department;
import com.cypher.user.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User addUser(User user) {
		log.info("In addUser method of UserService");
		return repository.save(user);
	}
	
	public ResponseTemplateVo getUserWithDepartment(int id) {
		log.info("In getUserWithDepartment method of UserService");
		User user = repository.findById(id).get();
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		return new ResponseTemplateVo(user, department);
	}
}
