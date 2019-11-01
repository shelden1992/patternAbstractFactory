package org.courses;

import org.courses.services.ConsoleCommunication;
import org.courses.services.FilmServices;

public class Main {

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        FilmServices filmServices = new FilmServices();
        filmServices.showFilms();
        filmServices.selectFilm();
        filmServices.selectLanguage();
        filmServices.sendAudioAndSubtitle();
        ConsoleCommunication.getInstance().showMessage(String.valueOf(filmServices.getFilm()));
    }

}
