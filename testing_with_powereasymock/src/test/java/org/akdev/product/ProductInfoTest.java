package org.akdev.product;

import org.akdev.allstatic.employee.product.ProductInfo;
import org.akdev.allstatic.employee.product.Version;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ProductInfo.class})
public class ProductInfoTest {

    @Test
    public void testProductInfo(){
        PowerMock.mockStaticPartial(ProductInfo.class,"getVersion");

        Version version = EasyMock.createMock(Version.class);
        EasyMock.expect(version.getReleaseDate()).andReturn("DummyReleaseDate");
        EasyMock.expect(version.getVersionNumber()).andReturn("001");

        EasyMock.expect(ProductInfo.getVersion()).andReturn(version);
        EasyMock.replay(version);
        PowerMock.replayAll();

        String productName = ProductInfo.getProductName();
        Version versionReturned = ProductInfo.getVersion();

        assertEquals(versionReturned.getReleaseDate(),"DummyReleaseDate");
        assertEquals(versionReturned.getVersionNumber(),"001");
        assertEquals(productName,"java tutorial");

    }
    /*
    Suppose if your class has 10 static methods, but you want to mock only 2 of the static methods, then by using 'mockStaticPartial' method, you can mock only those two static methods.
     */

}