import static org.junit.Assert.*;

public class test
{
  
  public void testFlatRateDiscountStrategy()
  {
    int amt = 100;
    FlatRateDiscountStrategy(amt);
    int price = 200;
    int result = applyDiscount(price);
    
    assertEquals(100, result);
  }
  
}
