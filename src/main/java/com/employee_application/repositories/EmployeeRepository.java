package com.employee_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_application.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
