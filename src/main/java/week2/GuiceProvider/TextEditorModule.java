package week2.GuiceProvider;

import com.google.inject.AbstractModule;

//Binding Module
class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).toProvider(SpellCheckerProvider.class);
    }
}