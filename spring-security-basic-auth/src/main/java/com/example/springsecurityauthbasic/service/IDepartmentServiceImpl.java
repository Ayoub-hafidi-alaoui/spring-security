package com.example.springsecurityauthbasic.service;

import com.example.springsecurityauthbasic.dto.DepartementRegistrationResponse;
import com.example.springsecurityauthbasic.dto.DepartmentRegistrationRequest;
import com.example.springsecurityauthbasic.entity.Department;
import com.example.springsecurityauthbasic.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class IDepartmentServiceImpl implements IDepartmentService {
    private final DepartmentRepository departmentRepository;

    public IDepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public DepartementRegistrationResponse registerDepartment(DepartmentRegistrationRequest request) {
        Department department = new Department();
        department.setName(request.departmentName());
        department.setManager(request.managerName());
        departmentRepository.save(department);
        return null;
    }
}
