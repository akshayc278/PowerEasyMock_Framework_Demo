package org.akdev.allstatic.employee.input;

import org.akdev.allstatic.employee.MethodNotImplemented;

public class InputUtil {

    public static void readInput(String message) {
        readInputFromUI(message.toUpperCase());
    }

    private static void readInputFromUI(String message) {
        System.out.println("Message is " + message);
    }

    public static int readInput2(int message){
        return readInputFromUI2(message);
    }

    private static int readInputFromUI2(int message){
        return 12;
    }

    public static String toUpper(String str){
        throw new MethodNotImplemented();
    }
    public static String toUpperAndRepeatStringTwice(String str){
        String upperCase = toUpper(str);
        return upperCase + upperCase;
    }
}
