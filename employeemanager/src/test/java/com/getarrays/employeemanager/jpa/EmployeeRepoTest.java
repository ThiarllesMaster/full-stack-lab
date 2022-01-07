package com.getarrays.employeemanager.jpa;

import com.getarrays.employeemanager.model.Employee;
import com.getarrays.employeemanager.repo.EmployeeRepo;
import java.util.Optional;
import javax.persistence.EntityManager;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    EmployeeRepo employeeRepo;

    @Test
    public void findEmployeeById() {
        Employee e = new Employee();
        e.setEmployeeCode("employeedode");
        entityManager.persist(e);

        Optional<Employee> employeeDB = employeeRepo.findEmployeeById(e.getId());
        assertEquals(e, employeeDB.get());

    }


}
