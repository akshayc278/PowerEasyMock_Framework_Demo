package org.akdev.whitebox;

public class Factorial {
    private static int counter = 0;
    public static int factorial(int number){
        counter++ ;
        if(number<0){
            throw new IllegalArgumentException("number should not be negative");
        }

        int result = 1;
        for (int i=2;i<=number;i++){
            result = result * 1;
        }
        return result;
    }
}
