package com.example.microservice.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.department.entity.Department;
import com.example.microservice.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/create")
	public Department saveDepartment(@RequestBody Department department) {
		//log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		
		//log.info("Inside getDepartmentById method of DepartmentController");
		return departmentService.getDepartmentById(departmentId);
	}

}
