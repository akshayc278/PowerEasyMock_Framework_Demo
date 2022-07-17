package org.akdev.whitebox.other;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

public class EmployeeTest {

    private static String NO_NAME = "no_name";
    private void assertPropertiees(Employee emp, int id,String firstName,String lastName){
        assertEquals(emp.getId(),id);
        assertEquals(emp.getFirstName(),firstName);
        assertEquals(emp.getLastName(),lastName);
    }

    @Test
    public void testConstructor() throws Exception{
        Constructor<Employee> con = Whitebox.getConstructor(Employee.class,int.class);
        Employee emp = con.newInstance(1234);
        assertPropertiees(emp,1234,NO_NAME,NO_NAME);
        /*
        Whitebox: access constructors
Whitebox class provides 'getConstructor' method, it is used to get the declared constructor of given class.
         */
    }

    @Test
    public void testWithNewValuesInline() throws Exception{
        Employee emp=new Employee();
        Whitebox.setInternalState(emp,"id",23);
        Whitebox.setInternalState(emp,"firstName","akshay");
        Whitebox.setInternalState(emp,"lastName","chavan");
        assertPropertiees(emp,23,"akshay","chavan");
        /*
        Whitebox: initialize properties of an object
Whitebox provides following methods to set the value to a field.
         */
    }

    @Test
    public void testStaticVariablesetState(){
        Whitebox.setInternalState(Employee.class,"count",1);
        assertEquals(Employee.getCount(),1);
        /*
        Whitebox: initialize static properties
         */
    }

    @Test
    public void testDefaultConstructor(){
        Employee emp = new Employee(22, "ak","ch");
        int id = Whitebox.getInternalState(emp, "id");
        String firstName = Whitebox.getInternalState(emp, "firstName");
        String lastName = Whitebox.getInternalState(emp, "lastName");

        assertEquals(id, 22);
        assertEquals(firstName, "ak");
        assertEquals(lastName, "ch");
        //static
        //new Employee(23, "ak","ch");
        int count = Whitebox.getInternalState(Employee.class,"count");
        assertEquals(count,0);

    }

}