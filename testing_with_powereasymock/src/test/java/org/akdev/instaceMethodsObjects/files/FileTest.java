package org.akdev.instaceMethodsObjects.files;

import org.easymock.EasyMock;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

import static org.junit.Assert.*;

public class FileTest {
    @Test
    public void testInstaceMethodAndObject(){
        File file = PowerMock.createMock(File.class);
        EasyMock.expect(file.getName()).andReturn("FileNameTest");
        EasyMock.expect(file.getPath()).andReturn("/path");

        PowerMock.replayAll();
        assertEquals("FileNameTest",file.getName());
    }

}