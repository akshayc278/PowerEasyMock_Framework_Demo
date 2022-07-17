package org.akdev.allstatic.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    private EmployeeService employeeService;

    public EmployeeUtil(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    public EmployeeUtil() {
    }

    public List<String> getAllemployeeNames(List<Employee> listOfEmployee){
        List<String> empList = employeeService.getEmployeeFirstName(listOfEmployee);
        List<String> returnList = new ArrayList<>();
        for(String names : empList){
            returnList.add(names.toUpperCase());
        }
        return returnList;
    }

    public List<String> getAllemployeeStaticNames(List<Employee> listOfEmployee){
        List<String> empList = EmployeeService.getStaticEmployeeFirstName(listOfEmployee);
        List<String> returnList = new ArrayList<>();
        for(String names : empList){
            returnList.add(names.toUpperCase());
        }
        return returnList;
    }
}
