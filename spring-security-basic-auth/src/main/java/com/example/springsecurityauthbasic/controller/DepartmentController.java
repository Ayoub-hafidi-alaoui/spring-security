package com.example.springsecurityauthbasic.controller;

import com.example.springsecurityauthbasic.dto.DepartementRegistrationResponse;
import com.example.springsecurityauthbasic.dto.DepartmentRegistrationRequest;
import com.example.springsecurityauthbasic.repository.DepartmentRepository;
import com.example.springsecurityauthbasic.service.IDepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
    private final IDepartmentService departmentService;

    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<DepartementRegistrationResponse> registerDepartment(@RequestBody DepartmentRegistrationRequest  departmentRegistrationRequest) {
        log.info("registring department {}", departmentRegistrationRequest);
        DepartementRegistrationResponse departementRegistrationResponse = departmentService.registerDepartment(departmentRegistrationRequest);
        return new ResponseEntity<>(departementRegistrationResponse, HttpStatus.CREATED);
    }

}
