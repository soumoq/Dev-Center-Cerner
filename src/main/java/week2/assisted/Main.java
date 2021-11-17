package week2.assisted;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import week2.provider.explicitProvider.DiscountGuiceModule;

public class Main {
    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new PaymentModule());
        RealPayment realPayment = guice.getInstance(RealPayment.class);


    }
}
