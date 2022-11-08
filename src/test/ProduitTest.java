package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.Produit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ProduitTest {

    @Test
    public void prodEquals(){
        System.out.println("Test prodEquals");
        Assert.assertEquals(Produit.prod(5,3),15);
    }

    @Test
    public void prodNotEquals(){
        System.out.println("Test prodNotEquals");
        assertNotEquals(Produit.prod(1,1),3);
    }
}
