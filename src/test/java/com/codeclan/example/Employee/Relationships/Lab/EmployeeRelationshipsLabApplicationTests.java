package com.codeclan.example.Employee.Relationships.Lab;

import com.codeclan.example.Employee.Relationships.Lab.models.Department;
import com.codeclan.example.Employee.Relationships.Lab.models.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.example.Employee.Relationships.Lab.repositories.DepartmentRepository;
import com.codeclan.example.Employee.Relationships.Lab.repositories.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRelationshipsLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department marketing = new Department("Marketing");
		departmentRepository.save(marketing);

		Employee employee1 = new Employee("Ben", "Mackinnon", 1234, marketing);
		employeeRepository.save(employee1);
	}


}

