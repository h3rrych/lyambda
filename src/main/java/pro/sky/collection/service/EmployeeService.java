package pro.sky.collection.service;


import pro.sky.collection.model.Employee;

import java.util.Collection;
import java.util.Collections;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
