package com.validation.CRUDvalidation.Repository;

import com.validation.CRUDvalidation.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
