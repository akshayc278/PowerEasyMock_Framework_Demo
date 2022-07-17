package org.akdev.whitebox;

public class StringUtil {
    private boolean isStringPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    private static boolean isStringPalindromeStatic(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
