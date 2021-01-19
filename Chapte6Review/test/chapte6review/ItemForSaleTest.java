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
        
        // Assert - when using doubles, use the delta to say they are close enough
        assertEquals(expectedPrice, actualPrice, .00000001); 
    }
    
    @Test
    public void testSetPriceWithNegativeValue() {
        // AAA Format - Arrange, Act, Assert
        
        // Arrange
        double expectedPrice = 0;
        
        // Act
        ItemForSale item = new ItemForSale("", -4.2, 0);
        double actualPrice = item.getPrice();
        
        // Assert - when using doubles, use the delta to say they are close enough
        assertEquals(expectedPrice, actualPrice, .00000001); 
    }

    @Test
    public void testSetQuantity() {
        // Arrange
        int expectedQuantity = 42;
        
        // Act
        ItemForSale item = new ItemForSale("", 0, expectedQuantity );
        int actualQuantity = item.getQuantity();
        
        // Assert
        assertEquals(expectedQuantity, actualQuantity);
    }
    
    @Test
    public void testSetQuantityWithNegativeValue() {
        // Arrange
        int expectedQuantity = 0;
        
        // Act
        ItemForSale item = new ItemForSale("", 0, -42 );
        int actualQuantity = item.getQuantity();
        
        // Assert
        assertEquals(expectedQuantity, actualQuantity);
    }

    
    @Test
    public void testGetName() {
        // Arrange
        String expectedName = "Coffee";
        
        // Act
        ItemForSale item = new ItemForSale(expectedName, 0, 0);
        String actualName = item.getName();
        
        // Assert
        assertEquals(expectedName, actualName);
    }


    @Test
    public void testGetTotalCost() {
        // Arrange
        double itemCost = 4.2;
        int itemQuantity = 42;
        double expectedTotalCost = itemCost * itemQuantity;
        
        // Act
        ItemForSale item = new ItemForSale("", itemCost, itemQuantity);
        double actualTotalCost = item.getTotalCost();
        
        // Assert
        assertEquals(expectedTotalCost, actualTotalCost, .0000001);
    }
    
}
