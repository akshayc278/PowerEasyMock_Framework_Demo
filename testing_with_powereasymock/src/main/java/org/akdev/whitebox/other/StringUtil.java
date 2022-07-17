package org.akdev.whitebox.other;

public class StringUtil {
    public StringUtil(){
        System.out.println("hello");
    }

    public boolean isStringPalindrome(String str){
        if (str == null || str.isEmpty()){
            return true;
        }
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
