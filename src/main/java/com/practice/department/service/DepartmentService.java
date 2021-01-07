package com.practice.department.service;

import org.springframework.stereotype.Service;

import com.practice.department.entities.Department;

@Service
public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findDepartmentById(Long departmentId);

}
