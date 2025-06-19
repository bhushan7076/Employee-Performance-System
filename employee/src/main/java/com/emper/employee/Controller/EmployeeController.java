package com.emper.employee.Controller;

import com.emper.employee.Entity.Employee;
import com.emper.employee.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin // Optional, helps if you're calling from Angular frontend
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    // ✅ POST: Add new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
}
