package org.akdev.instaceMethodsObjects.employee;


import org.akdev.allstatic.employee.MethodNotImplemented;

import java.util.List;

public class EmployeeService {

    public List<String> getEmployeeFirstName(List<Employee> employees){
        throw new org.akdev.allstatic.employee.MethodNotImplemented();
    }

    public List<String> sortListOfEmployeeName(List<String> names){
        names.sort(null);
        return names;
    }
    public List<String> sortandGetAllNAmes(List<Employee> employees){
        List<String> empNames = getEmployeeFirstName(employees);
        return sortListOfEmployeeName(empNames);
    }
}

