package org.akdev.whitebox;

import org.junit.Test;

import java.lang.reflect.Field;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testWhiteBoxStaticVariable() throws Exception{
        Field field = Whitebox.getField(Factorial.class, "counter");
        long counter = field.getLong(null);
        assertEquals(counter,0);

        Factorial.factorial(5);
        counter = field.getLong(null);
        assertEquals(counter,1);
        /*
        Whitebox class provide 'getField' method to access the field of a class. By using this, we can test private fields.
         */
    }


}