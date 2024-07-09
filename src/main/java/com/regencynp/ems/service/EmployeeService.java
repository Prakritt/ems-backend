package com.regencynp.ems.service;

import com.regencynp.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto findEmployeeById(Long employeeId);

    List<EmployeeDto> getEmployees();
}
