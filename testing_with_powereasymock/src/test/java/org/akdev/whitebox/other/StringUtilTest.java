package org.akdev.whitebox.other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StringUtil.class})
public class StringUtilTest {

    @Test
    public void isStringPalindrome() throws Exception{
        StringUtil stringUtil = (StringUtil) Whitebox.newInstance(StringUtil.class);
        boolean isPalindome = stringUtil.isStringPalindrome("madam");
        assertTrue(isPalindome);
        /*
        Whitebox: Get instance of a class, without invoking its constructor
Whitebox class provides 'newInstance' method to get the instance of a class without invoking its constructor. This method is very useful, when you class contains all the private constructors and you want to instantiate for testing.
         */

        //method

        boolean isPalindrome = Whitebox.invokeMethod(new StringUtil(), "isStringPalindrome", "madam");
        assertTrue(isPalindrome);

//        Static method
//        boolean isPalindrome = Whitebox.invokeMethod(StringUtil.class, "isStringPalindrome", "madam");
//        assertTrue(isPalindrome);

//        invoke constructor
//        StringUtil stringUtil = Whitebox.invokeConstructor(StringUtil.class, "madam");
//        assertTrue(stringUtil.isStringPalindrome());
    }

}