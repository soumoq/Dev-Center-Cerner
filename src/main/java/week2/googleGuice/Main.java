package week2.googleGuice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import week2.googleGuice.module.*;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService checkoutService = injector.getInstance(CheckoutService.class);
        checkoutService.checkout(100.00);
    }
}
