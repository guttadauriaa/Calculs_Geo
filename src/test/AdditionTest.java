package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import main.Addition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class AdditionTest {

    @Test
    public void addEquals(){
        System.out.println("Test addEquals");
        Assert.assertEquals(Addition.add(5,3),8);
    }

    @Test
    public void addNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(1,1),3);
    }
}
