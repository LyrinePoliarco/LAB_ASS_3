public class PaymentApp {
    public static void main(String[] args) {
        Order gcash = new Order("keyboard", 300.0, 10, new GCash());
        System.out.println("Order item is " + gcash.getItem());
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity() + "\n");

        System.out.println("Payment Order Details if " + gcash.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount Rate " + gcash.getPaymentMode().calculateDiscount());
        System.out.println("Payment Amount is " + gcash.getTotalAmount() + "\n");

        Order maya = new Order();
        maya.setItem("keyboard");
        maya.setUnitPrice(300.0);
        maya.setQuantity(10);
        maya.setPaymentMode(new Maya());

        System.out.println("Payment Order Details if " + maya.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount Rate " + maya.getPaymentMode().calculateDiscount());
        System.out.println("Payment Amount is " + maya.getTotalAmount()+ "\n");

        Order shopeePay = new Order("keyboard", 300.0, 10, new ShopeePay());
        System.out.println("Payment Order Details if " + shopeePay.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount Rate " + shopeePay.getPaymentMode().calculateDiscount());
        System.out.println("Payment Amount is " + shopeePay.getTotalAmount());

    }
}