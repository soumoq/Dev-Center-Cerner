package week2.GuiceProvider;

import com.google.inject.Inject;

class TextEditor {
    private SpellChecker spellChecker;

    @Inject
    public TextEditor( SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}
