package com.example.springsecurityauthbasic.service;

import com.example.springsecurityauthbasic.dto.DepartementRegistrationResponse;
import com.example.springsecurityauthbasic.dto.DepartmentRegistrationRequest;
import com.example.springsecurityauthbasic.repository.DepartmentRepository;

public class IDepartmentServiceImpl implements IDepartmentService {
    private final DepartmentRepository departmentRepository;

    public IDepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public DepartementRegistrationResponse registerDepartment(DepartmentRegistrationRequest request) {
        return null;
    }
}
