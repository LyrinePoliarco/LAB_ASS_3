# Payment Application

## Overview

This payment application allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application calculates the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the `totalAmount` attribute of the `Order` class.

## Classes and Interfaces

### PaymentApp class

This class serves as the entry point for the application. It demonstrates how to create an `Order` object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.

### Order class

This class stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (`totalAmount`).

### PaymentMode interface

An interface that defines a method for calculating the discount offered by the payment method.

### Concrete Implementations of PaymentMode

1. **GCash:**
   - Does not offer any discount (discount rate = 0.0)

2. **Maya:**
   - Offers a 5% discount (discount rate = 0.05)

3. **ShopeePay:**
   - Offers a 10% discount (discount rate = 0.10)

## Sample Output

```java
Order item is keyboard.
Unit price is 300.0
Quantity is 10

Payment order details if GCash
Discount rate is 0.0
Payment amount is 3000.0

Payment order details if Maya
Discount rate is 0.05
Payment amount is 2850.0

Payment order details if ShopeePay
Discount rate is 0.10
Payment amount is 2700.0
