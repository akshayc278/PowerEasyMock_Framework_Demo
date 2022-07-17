package org.akdev.employee;

import org.akdev.allstatic.employee.Employee;
import org.akdev.allstatic.employee.EmployeeService;
import org.akdev.allstatic.employee.EmployeeUtil;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ EmployeeService.class})
public class EmployeeUtilTest2 {
    private List<Employee> employees;
    private List<String> employeeNames;

    @Before public void initList() {
        Employee e1 = new Employee(1, "akshay", "chavan", 50000, "India");
        Employee e2 = new Employee(2, "paresh", "dec", 30000, "ShriLanka");
        Employee e3 = new Employee(3, "lal", "devid", 70000, "Usa");
        employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employeeNames = new ArrayList<>();
        employeeNames.add("akshay");
        employeeNames.add("lal");
    }

    @Test
    public void testStaticMethodfromClass(){
        PowerMock.mockStatic(EmployeeService.class);
        EasyMock.expect(EmployeeService.getStaticEmployeeFirstName(employees)).andReturn(employeeNames);
        PowerMock.replayAll();

        EmployeeUtil empUtil=new EmployeeUtil();

        List<String> empListNames= empUtil.getAllemployeeStaticNames(employees);
        assertEquals(empListNames.size(),2);
    }

}
