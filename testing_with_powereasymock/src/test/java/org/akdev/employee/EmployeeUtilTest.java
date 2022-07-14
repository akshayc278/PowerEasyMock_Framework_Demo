package org.akdev.employee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(PowerMockRunner.class)
@PrepareForTest({EmployeeService.class})
public class EmployeeUtilTest {

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

    @Test public void getAllEmpTest() {


        EmployeeService employeeService = EasyMock.createMock(EmployeeService.class);
        EasyMock.expect(employeeService.getEmployeeFirstName(employees)).andReturn(employeeNames);
        EasyMock.replay(employeeService);
        EmployeeUtil employeeUtil = new EmployeeUtil(employeeService);

        List<String> empListNames = employeeUtil.getAllemployeeNames(employees);
        assertEquals(empListNames.size(), 2);
    }

    /*
    @RunWith(PowerMockRunner.class)
Junit invokes the test of the class with PowerMockRunner class, instead of the runner built into Junit.

@PrepareForTest( {EmployeeService.class} )
This annotation tells PowerMock to prepare certain classes for testing. This annotation can be placed at both test classes and individual test methods. If placed on a class all test methods in this test class will be handled by PowerMock (to allow for testability). To override this behavior for a single method just place a @PrepareForTest annotation on the specific test method. This is useful in situations where for example you'd like to modify class X in test method A but in test method B you want X to be left intact. In situations like this you place a @PrepareForTest on method B.

EmployeeService mockedEmployeeService = EasyMock.createMock(EmployeeService.class);
Above statement creates a mock object of this class.

EasyMock.expect(mockedEmployeeService.getEmployeeFirstNames(employees)).andReturn(employeeNames);
When getEmployeeFirstNames method is called with 'employees' as an argument, then return employeeNames, instead of invoking original method.

EasyMock.replay(mockedEmployeeService);
Activate the mocked behavior. When you write 'EasyMock.expect(mockedEmployeeService.getEmployeeFirstNames(employees)).andReturn(employeeNames);',

You recorded the expected behavior. But, when you write 'EasyMock.replay(mockedEmployeeService);' , you are actually activating it.
     */

}
