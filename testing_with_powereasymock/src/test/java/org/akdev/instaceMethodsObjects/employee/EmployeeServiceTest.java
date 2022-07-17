package org.akdev.instaceMethodsObjects.employee;

import org.easymock.EasyMock;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void testSortAndGetEmployee(){
        Employee e1 = new Employee(1,"akshay","chavan");
        Employee e2 = new Employee(2,"hari","haran");

        List<Employee> emps = Arrays.asList(e1,e2);
        List<String> empNames =  Arrays.asList("ak");

        EmployeeService empServ2 = PowerMock.createPartialMock(EmployeeService.class,"getEmployeeFirstName");
        EasyMock.expect(empServ2.getEmployeeFirstName(emps)).andReturn(empNames);
        PowerMock.replayAll();

        List<String> names = empServ2.sortandGetAllNAmes(emps);
        PowerMock.verifyAll();
        assertEquals(names.get(0),"ak");


    }

}