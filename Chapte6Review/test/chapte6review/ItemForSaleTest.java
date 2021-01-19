package chapte6review;

import org.junit.Test;
import static org.junit.Assert.*;


public class ItemForSaleTest {
    
    public ItemForSaleTest() {
    }

    @Test
    public void testSetPrice() {
        // AAA Format - Arrange, Act, Assert
        
        // Arrange
        double expectedPrice = 4.2;
        
        // Act
        ItemForSale item = new ItemForSale("", expectedPrice, 0);
        double actualPrice = item.getPrice();
        
        // Assert
        assertEquals(expectedPrice, actualPrice, .00000001);
        
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        ItemForSale instance = null;
        instance.setQuantity(quantity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ItemForSale instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        ItemForSale instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ItemForSale instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        ItemForSale instance = null;
        double expResult = 0.0;
        double result = instance.getTotalCost();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
