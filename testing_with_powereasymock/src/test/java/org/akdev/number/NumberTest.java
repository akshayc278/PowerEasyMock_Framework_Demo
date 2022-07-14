package org.akdev.number;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Number.class})
public class NumberTest {

    @Test
    public void mockVoidMethodTest(){
        PowerMock.mockStaticPartial(Number.class,"readInputFromUI");
        Number.readInputFromUI();
        PowerMock.expectLastCall().times(5);

        PowerMock.replayAll();
        for(int i=0;i<5;i++){
            Number.readInput();
        }
    }
    /*
    Sometimes you don’t want to call void methods, while testing a function (which in turn calling this void method). By using ‘expectLastCall’ method of PowerMock class, you can mock static void methods.

     */
}