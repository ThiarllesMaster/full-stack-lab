package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    public void deleteEmployeeById(Long id);

    public Optional<Employee> findEmployeeById(Long id);
}
