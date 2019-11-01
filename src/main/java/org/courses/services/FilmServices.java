package org.courses.services;

import org.courses.AbstractFactory;
import org.courses.FactoryChoose;
import org.courses.audio.Audio;
import org.courses.film.Film;
import org.courses.film.FilmsHolder;
import org.courses.subtitle.Subtitle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmServices {
    private static ConsoleCommunication console = ConsoleCommunication.getInstance();
    private static FilmsHolder filmsHolder;
    private static Film film;
    private static String language;
    private Scanner scanner = new Scanner(System.in);

    public FilmServices() {
        createdFilmsHolder();
    }

    private void createdFilmsHolder() {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Home Alone", 1.44, 50, new Audio(), new Subtitle()));
        films.add(new Film("Home Alone2", 1.33, 45, new Audio(), new Subtitle()));
        films.add(new Film("New Year's Eve", 1.23, 55, new Audio(), new Subtitle()));
        filmsHolder = new FilmsHolder(films);
    }

    public void showFilms() {

        filmsHolder.getFilmList().forEach(film -> {
            console.showMessage(String.valueOf(film));
        });
    }

    public void sendAudioAndSubtitle() {
        FactoryChoose instance = FactoryChoose.getInstance();
        AbstractFactory langFactory = instance.getFactory(language);
        film.setAudio(langFactory.createAudio());
        film.setSubtitle(langFactory.createSubtitle());

    }

    public void selectFilm() {
        System.out.println("Now select film, please");
        film = filmsHolder.getFilmByName(scanner.nextLine());

    }

    public void selectLanguage() {
        System.out.println("Now select language, please" + FactoryChoose.getInstance().getLanguageList());

        language = scanner.nextLine();
    }

    public Film getFilm() {
        return film;
    }
}
