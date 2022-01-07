package com.getarrays.employeemanager.services;

import com.getarrays.employeemanager.model.Employee;
import com.getarrays.employeemanager.repo.EmployeeRepo;
import com.getarrays.employeemanager.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeRepo employeeRepo;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void findAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setEmail("email");
        employees.add(e1);

        when(employeeRepo.findAll()).thenReturn(employees);

        List<Employee> employeesService = employeeService.findAllEmployees();
        assertEquals(employees, employeesService);
    }

}
