package week2.googleGuice.module;

import com.google.inject.AbstractModule;
import week2.googleGuice.Discountable;
import week2.googleGuice.NightOwlDiscount;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(NightOwlDiscount.class);

    }
}
