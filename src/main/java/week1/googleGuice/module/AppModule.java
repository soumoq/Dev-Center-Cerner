package week1.googleGuice.module;

import com.google.inject.AbstractModule;
import week1.googleGuice.DrawShape;
import week1.googleGuice.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
