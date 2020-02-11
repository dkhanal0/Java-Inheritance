/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Modifier;

class Tests {

  @Test void inspectAccount() {
    // Make sure Account is both public and abstract and the parent class
    try {
      Class<?> c = Class.forName("inheritance.Account");
      // Inspect modifiers
      String modifiers = Modifier.toString(c.getModifiers());
      assertEquals(modifiers, "public abstract", "Account is not 'public abstract'");
      // Inspect parent classes
      String ancestor = c.getSuperclass().getCanonicalName();
      assertEquals(ancestor, "java.lang.Object", "Account is not a parent class");
    } catch (Exception e){
      // Report exception
      fail("Could not inspect Account class");
    }

  }

  @Test void inspectCommercialAccount() {
    // Make sure CommercialAccount is both public and abstract and the parent class
    try {
      Class<?> c = Class.forName("inheritance.CommercialAccount");
      // Inspect modifiers
      String modifiers = Modifier.toString(c.getModifiers());
      assertEquals(modifiers, "public", "CommercialAccount is not 'public'");
      // Inspect parent classes
      String ancestor = c.getSuperclass().getCanonicalName();
      assertEquals(ancestor, "inheritance.Account", "CommercialAccount is not a child class of Account");
    } catch (Exception e){
      // Report exception
      fail("Could not inspect CommercialAccount class");
    }

  }

  @Test void inspectNonCommercialAccount() {
    // Make sure CommercialAccount is both public and abstract and the parent class
    try {
      Class<?> c = Class.forName("inheritance.NonCommercialAccount");
      // Inspect modifiers
      String modifiers = Modifier.toString(c.getModifiers());
      assertEquals(modifiers, "public", "NonCommercialAccount is not 'public'");
      // Inspect parent classes
      String ancestor = c.getSuperclass().getCanonicalName();
      assertEquals(ancestor, "inheritance.Account", "NonCommercialAccount is not a child class of Account");
    } catch (Exception e){
      // Report exception
      fail("Could not inspect NonCommericalAccount class");
    }

  }

  @Test void inspectProduct() {
    // Make sure Product is both public and abstract and the parent class
    try {
      Class<?> c = Class.forName("inheritance.Product");
      // Inspect modifiers
      String modifiers = Modifier.toString(c.getModifiers());
      assertEquals(modifiers, "public abstract", "Product is not 'public abstract'");
      // Inspect parent classes
      String ancestor = c.getSuperclass().getCanonicalName();
      assertEquals(ancestor, "java.lang.Object", "Product is not a parent class");
    } catch (Exception e){
      // Report exception
      fail("Could not inspect Product class");
    }

  }

  @Test void customerTest(){
  // Instantiate a customer
  Customer c1 = new Customer("Early", "James", "123 Main St", "13126");
  assertEquals("Early", c1.getLastName(), "\n\tExpected: Early\n\t  Actual: " + c1.getLastName() );
  assertEquals("James", c1.getFirstName(), "\n\tExpected: James\n\t  Actual: " + c1.getFirstName() );
  assertEquals("123 Main St", c1.getStreetAddress(), "\n\tExpected: 123 Main St\n\t  Actual: " + c1.getStreetAddress() );
  assertEquals("13126", c1.getZipCode(), "\n\tExpected: 13126\n\t  Actual: " + c1.getZipCode() );
  assertNull(c1.getAccount(), "Initial Account reference should be null");
}

@Test void nonCommercialAccountTest(){
  // Instantiate a customer
  Customer c1 = new Customer("Early", "James", "123 Main St", "13126");

  // Create an account
  Account a1 = new NonCommercialAccount("123-456-78", c1, 1.45);
  assertEquals("123-456-78", a1.getAccountNumber());
  assertEquals(c1, a1.getCustomer());
  assertEquals(a1.getBalance(), 0);

  // Associate account with customer
  c1.setAccount(a1);
  assertEquals(a1, c1.getAccount());
}

@Test void commercialAccountTest(){
  // Instantiate a customer
  Customer c1 = new Customer("Early", "James", "123 Main St", "13126");

  // Create an account
  CommercialAccount a1 = new CommercialAccount("123-456-78", c1, 12345, "123-56");
  assertEquals("123-456-78", a1.getAccountNumber());
  assertEquals(c1, a1.getCustomer());
  assertEquals(a1.getBalance(), 0);
  assertEquals(a1.getTaxId(), "123-56");

  // Associate account with customer
  c1.setAccount(a1);
  assertEquals(a1, c1.getAccount());
}

@Test void taxableProductTest(){
  // Instantiate a taxable product

  Product p1 = new TaxableProduct("Snickers", "234-567-89", 0.99);
  assertEquals("Snickers", p1.getProductName());
  assertEquals("234-567-89", p1.getIsbn());
  assertEquals(0.99, p1.getUnitPrice());
}

@Test void nonTaxableProductTest(){
  // Instantiate a non-taxable product
  Product p1 = new NonTaxableProduct("Milk", "345-678-90", 2.79);
  assertEquals("Milk", p1.getProductName());
  assertEquals("345-678-90", p1.getIsbn());
  assertEquals(2.79, p1.getUnitPrice());
}

@Test void orderItemTest(){
  // Instantiate a product
  Product p1 = new TaxableProduct("Snickers", "234-567-89", 0.99);

  // Instantiate an OrderItem
  OrderItem oi1 = new OrderItem(p1, 2);

  assertEquals(p1, oi1.getProduct());
  assertEquals(2, oi1.getQuantity());
  assertEquals(1.98, oi1.getPrice());
}


  @Test void orderTest(){
    // Instantiate a customer
    Customer c1 = new Customer("Early", "James", "123 Main St", "13126");
    // Create an account
    Account a1 = new NonCommercialAccount("123-456-78", c1,1.34);
    // Associate with customer
    c1.setAccount(a1);

    // Instantiate some products
    Product p1 = new TaxableProduct("Snickers", "234-567-89", 0.99);
    Product p2 = new TaxableProduct("Ear buds", "345-678-90", 10.99);
    Product p3 = new NonTaxableProduct("Socks", "345-678-90", 4.99);


    // Instantiate OrderItems
    OrderItem oi1 = new OrderItem(p1, 2);
    OrderItem oi2 = new OrderItem(p2, 1);
    OrderItem oi3 = new OrderItem(p3, 3);

    // Instantiate an Order
    Order o1 = new Order(a1);
    assertEquals(a1, o1.getAccount());
    assertEquals(0, o1.getItems().length); // Should be an array of length 0

    // Add items to the order
    o1.addItem(oi1);
    o1.addItem(oi2);
    o1.addItem(oi3);
    // Check the size and total price
    assertEquals(3, o1.getItems().length);
    assertEquals(27.94, o1.getTotal());
  }


}
