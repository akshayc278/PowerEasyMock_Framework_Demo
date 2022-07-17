package org.akdev.whitebox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ StringUtil.class })
public class StringUtilTest {

    @Test
    public void isStringPalindrome()
            throws Exception {
        StringUtil stringUtil = new StringUtil();

        Method method = Whitebox.getMethod(StringUtil.class, "isStringPalindrome", String.class);

        boolean isPalindrome = (Boolean) method.invoke(stringUtil, "madam");

        assertTrue(isPalindrome);
        /*
        Whitebox: test private instance methods
Whitebox class provides 'getMethod', by using this we can get access to a method reference of the class
         */

    }
    @Test
    public void isStringPalindromeStatic()
            throws Exception {
        StringUtil stringUtil = new StringUtil();

        Method method = Whitebox.getMethod(StringUtil.class, "isStringPalindromeStatic", String.class);

        boolean isPalindrome = (Boolean) method.invoke(stringUtil, "madam");

        assertTrue(isPalindrome);
        /*
        static private methods using Whitebox class.   */

    }

}

