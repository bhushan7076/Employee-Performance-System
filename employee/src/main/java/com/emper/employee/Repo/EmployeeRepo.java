package com.emper.employee.Repo;

import com.emper.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    boolean existsByUemail(String uemail);
   
}
