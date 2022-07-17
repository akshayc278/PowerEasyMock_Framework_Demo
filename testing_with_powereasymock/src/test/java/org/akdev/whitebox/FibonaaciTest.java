package org.akdev.whitebox;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class FibonaaciTest {

    @Test
    public void testFibbonaaci() throws Exception{
        Fibonaaci fib =new Fibonaaci();
        Field field = Whitebox.getField(Fibonaaci.class,"counter");

        long counter=  field.getLong(fib);

        assertEquals(counter, 0);

        field.setAccessible(true);
        field.setInt(fib,0);
        fib.fibMethod(2);
        counter = field.getInt(fib);
        assertEquals(counter,3);
        /*
        access private instance field of a class
             */

    }
}