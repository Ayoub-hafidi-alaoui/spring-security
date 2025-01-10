package com.example.springsecurityauthbasic.service;

import com.example.springsecurityauthbasic.dto.DepartementRegistrationResponse;
import com.example.springsecurityauthbasic.dto.DepartmentRegistrationRequest;
import com.example.springsecurityauthbasic.entity.Department;

public interface IDepartmentService {
    DepartementRegistrationResponse registerDepartment(DepartmentRegistrationRequest request);
}
