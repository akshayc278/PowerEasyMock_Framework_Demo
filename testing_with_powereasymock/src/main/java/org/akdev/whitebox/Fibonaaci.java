package org.akdev.whitebox;

public class Fibonaaci {

    private int counter = 0;

    public int fibMethod(int number) {
        counter++;
        if (number == 0 || number == 1){
            return 1;
        }
        return fibMethod(number - 1) +fibMethod(number-2);
    }
}
