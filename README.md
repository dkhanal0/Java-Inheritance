# CSC 241 inheritance

In this assignment, we will modify the code used in the previous assignment in
order to introduce the concept of inheritance. Inheritance is a feature of object
programming languages that permit a new class to acquire properties of an
existing class. This simplifies development and facilitates good program design.

Follow the specification below and make the necessary changes and additions.

## Specification

### Account
This class becomes abstract. It will be used later in an inheritance relationship
with two new classes, `CommercialAccount` and `NonCommercialAccount`.

### CommercialAccount
This new class represents accounts that are owned by a business and are therefore
exempt from sales taxes (in some states). This class should inherit all
the methods from the the `Account` class. In addition, the following modifications
are required.
- The constructor should add a new tax id number (String) to its list of
parameters, and it should call the parent constructor to initialize the others.
- getTaxId() - Returns the tax id for this account

### NonCommercialAccount
This new class represents accounts that are owned by non-commercial customers. It
should merely extend the `Account` class and implement the constructor, as needed.   

### Product
This class becomes abstract. It will be used later in an inheritance relationship
with two new classes, `TaxableProduct` and `NonTaxableProduct`.

### TaxableProduct
This class should extend the `Product` class and implement the constructor, as needed.

### NonTaxableProduct
This class should extend the `Product` class and implement the constructor, as needed.

### Customer, OrderItem, Order
These classes are unchanged from the previous assignment, but must be present in the `inheritance` Java package.


## Testing
When you push your code back to your repository, GitHub will initiate a series of
tests to verify the correct operation of each of the required methods.
