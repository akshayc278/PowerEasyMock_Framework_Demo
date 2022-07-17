package org.akdev.whitebox;

import org.powermock.reflect.Whitebox;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ModelTest {

    private static void printObjectInfo(Model model, Field[] fields) throws Exception{
        for (Field field:fields){
            String name = field.getName();
            if ("noOfObjects".equals(name)) {
                System.out.println("noOfObjects :  " + field.getInt(model));
            } else if ("name".equals(name)) {
                System.out.println("name :  " + field.get(model));
            } else if ("version".equals(name)) {
                System.out.println("version :  " + field.get(model));
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Field[] fields = Whitebox.getFields(Model.class, "noOfObjects", "name", "version");

        Model model1 = new Model();
        System.out.println("After crating model object1");
        printObjectInfo(model1, fields);

        System.out.println("\nAfter crating model object2");
        Model model2 = new Model("4-Factor Auth");
        printObjectInfo(model2, fields);

        System.out.println("\nAfter crating model object3");
        Model model3 = new Model("Self-Learn", "1.4");
        printObjectInfo(model3, fields);
        /*
        Whitebox: get all the fields of a class
Whitebox class provides 'getFields' method to get all the fields of a class.
         */

    }

}