package org.akdev.instaceMethodsObjects.StringUtil;

import org.easymock.EasyMock;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void toUpperAndRepeatStringTwice() {
        StringUtil stringUtil = PowerMock.createPartialMock(StringUtil.class, "toUpper");

        EasyMock.expect(stringUtil.toUpper(EasyMock.anyObject())).andReturn("HELLO PTR").times(1);

        EasyMock.replay(stringUtil);

        String result = stringUtil.toUpperAndRepeatStringTwice("hello ptr");

        assertEquals(result, "HELLO PTRHELLO PTR");

        PowerMock.verifyAll();
    }
}