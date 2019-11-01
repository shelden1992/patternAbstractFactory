package org.courses.audio;

import java.util.StringJoiner;

public class Audio {
    private LanguageAudioFilms languageAudioFilms;

    public Audio(LanguageAudioFilms languageAudioFilms) {
        this.languageAudioFilms = languageAudioFilms;
    }

    public Audio() {
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Audio.class.getSimpleName() + "[", "]")
                .add("languageAudioFilms=" + languageAudioFilms)
                .toString();
    }

    public LanguageAudioFilms getLanguageAudioFilms() {
        return languageAudioFilms;
    }

    public void setLanguageAudioFilms(LanguageAudioFilms languageAudioFilms) {
        this.languageAudioFilms = languageAudioFilms;
    }
}
