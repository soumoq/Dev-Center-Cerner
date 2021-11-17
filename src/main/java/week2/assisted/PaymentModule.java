package week2.assisted;

import com.google.inject.assistedinject.FactoryModuleBuilder;

public class PaymentModule extends com.google.inject.AbstractModule {
    @Override
    protected void configure() {
        install(new FactoryModuleBuilder()
                .implement(Payment.class, RealPayment.class)
                .build(PaymentFactory.class));
    }
}
