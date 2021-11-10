package googleGuice.module;

import com.google.inject.AbstractModule;
import googleGuice.DrawShape;
import googleGuice.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
