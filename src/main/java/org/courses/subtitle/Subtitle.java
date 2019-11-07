package org.courses.subtitle;


import java.util.StringJoiner;

public class Subtitle {
    private LanguageSubtitle languageSubtitle;

    public Subtitle(LanguageSubtitle languageSubtitle) {
        this.languageSubtitle = languageSubtitle;
    }

    public Subtitle() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Subtitle.class.getSimpleName() + "[", "]")
                .add("languageSubtitle=" + languageSubtitle)
                .toString();
    }

    public LanguageSubtitle getLanguageSubtitle() {
        return languageSubtitle;
    }

    public void setLanguageSubtitle(LanguageSubtitle languageSubtitle) {
        this.languageSubtitle = languageSubtitle;
    }
}
