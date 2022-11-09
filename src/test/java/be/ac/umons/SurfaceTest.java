package be.ac.umons;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SurfaceTest {
    @Test
    public void SurfaEquals(){
        System.out.println("Test SurfEquals");
        Assert.assertEquals(Surface.calcsurf(5,3),15);
    }

    @Test
    public void SurfaNotEquals(){
        System.out.println("Test SurfNotEquals");
        assertNotEquals(Surface.calcsurf(1,1),3);
    }
}