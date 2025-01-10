package com.example.springsecurityauthbasic.dto;

import com.example.springsecurityauthbasic.departmentEnum.DepartmentStatus;

public record DepartementRegistrationResponse(DepartmentStatus status, String managerName) {
}
