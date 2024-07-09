package com.regencynp.ems.service.impl;

import com.regencynp.ems.dto.EmployeeDto;
import com.regencynp.ems.entity.Employee;
import com.regencynp.ems.exception.ResourceNotFoundException;
import com.regencynp.ems.mapper.EmployeeMapper;
import com.regencynp.ems.repository.EmployeeRepository;
import com.regencynp.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public EmployeeDto findEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee Not Found"));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }


}
