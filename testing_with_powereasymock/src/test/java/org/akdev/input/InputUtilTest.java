package org.akdev.input;

import org.akdev.allstatic.employee.input.InputUtil;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ InputUtil.class})
public class InputUtilTest {

    @Test
    public void mockVoidEventMethod() throws Exception{
        String message = "Hello Akshay";
        PowerMock.mockStaticPartial(InputUtil.class,"readInputFromUI");

        PowerMock.expectPrivate(InputUtil.class,"readInputFromUI",message.toUpperCase()).times(5);
        PowerMock.replayAll();

        for (int i=0;i<5;i++){
            InputUtil.readInput(message);
        }
        PowerMock.verifyAll();
    }
    /*PowerMock provides 'expectPrivate' method to specify expectations on private methods using the method name.
    */

    @Test
    public void testPrivateIntmethod() throws Exception{
        String message = "Enter the number";
        String methodToMock = "readInputFromUI2";

        PowerMock.mockStaticPartial(InputUtil.class,methodToMock);
        PowerMock.expectPrivate(InputUtil.class,methodToMock,5).andReturn(10).times(1);
        PowerMock.replayAll();
        int number = InputUtil.readInput2(5);
        assertEquals(number,10);
        PowerMock.verifyAll();
        /*how to mock static non-void private methods.*/

    }

    @Test
    public void toUpperAndRepeatStringTwice(){
        PowerMock.mockStaticPartial(InputUtil.class,"toUpper");
        EasyMock.expect(InputUtil.toUpper(EasyMock.anyObject())).andReturn("HELLO PTR").times(1);
        PowerMock.replayAll();
        String result = InputUtil.toUpperAndRepeatStringTwice("hello");
        assertEquals(result,"HELLO PTRHELLO PTR");
        PowerMock.verifyAll();
        /*EasyMock class provide 'anyObject()' by using this we can tell the mocked method to accept any object as argument.*/
    }

    @Test
    public void toUpperAndRepeatStringTwice2(){
        PowerMock.mockStaticPartial(InputUtil.class,"toUpper");
        EasyMock.expect(InputUtil.toUpper(EasyMock.isA(String.class))).andReturn("HELLO PTR").times(1);
        PowerMock.replayAll();
        String result = InputUtil.toUpperAndRepeatStringTwice("hello");
        assertEquals(result,"HELLO PTRHELLO PTR");
        PowerMock.verifyAll();
        /*
        EasyMock class provide 'isA()' by using this we can tell the mocked method to accept any object of this type as argument.
         */
    }

}