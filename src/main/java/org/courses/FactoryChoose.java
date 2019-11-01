package org.courses;

import org.courses.factory.EnglishFilmsFactory;
import org.courses.factory.GermanFilmsFactory;
import org.courses.factory.UkrainianFilmsFactory;

import java.util.ArrayList;
import java.util.List;

public class FactoryChoose {
    private static final FactoryChoose INSTANCE = new FactoryChoose();
    private static List<String> list;

    private FactoryChoose() {
        list = new ArrayList<>();
        list.add("ENGLISH");
        list.add("GERMAN");
        list.add("UKRAINIAN");
    }

    public static FactoryChoose getInstance() {
        return INSTANCE;
    }

    public List<String> getLanguageList() {
        return list;
    }

    public AbstractFactory getFactory(String languageAudioFilms) {
        switch (languageAudioFilms) {
            case "ENGLISH":
                return new EnglishFilmsFactory();
            case "GERMAN":
                return new GermanFilmsFactory();
            default:
                return new UkrainianFilmsFactory();
        }
    }
}
