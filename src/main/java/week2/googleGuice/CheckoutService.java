package week2.googleGuice;

import javax.inject.Inject;

public class CheckoutService {
    private Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCardTotal) {
        double totalAfterDiscount = shoppingCardTotal - (shoppingCardTotal * discountable.getDiscount());
        System.out.println("Discount: " + totalAfterDiscount);
        return totalAfterDiscount;
    }
}

