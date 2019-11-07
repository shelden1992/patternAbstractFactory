package org.courses.film;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class FilmsHolder {
    private final static Logger LOG = Logger.getLogger(FilmsHolder.class);
    private List<Film> filmList;

    public FilmsHolder(List<Film> filmList) {
        this.filmList = filmList;
    }

    public void addFilm(Film film) {
        if (Objects.nonNull(film)) {
            filmList.add(film);
            LOG.debug("Added film " + film);
        } else throw new NullPointerException();
    }

    public Film getFilmByName(String str) {
        if (filmList.stream().anyMatch(ifContainInFilmHolder(str))) {
            Film film = filmList.stream().filter(ifContainInFilmHolder(str)).findAny().orElse(null);
            LOG.info("Choose film = " + film);
            return film;
        } else LOG.info("It's film not available now" + str);
        return filmList.get(randomFilm());
    }

    private int randomFilm() {
        int size = filmList.size();
        return (int) (Math.random() * size - 1);
    }

    private Predicate<Film> ifContainInFilmHolder(String str) {
        return film -> film.getName().equals(str);
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
}
