package org.courses.film;

import org.courses.audio.Audio;
import org.courses.subtitle.Subtitle;

import java.util.StringJoiner;

public class Film {
    private String name;
    private double timing;
    private double price;
    private Audio audio;
    private Subtitle subtitle;

    public Film(String name, double timing, double price, Audio audio, Subtitle subtitle) {
        this.name = name;
        this.timing = timing;
        this.price = price;
        this.audio = audio;
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", Film.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("timing=" + timing)
                .add("price=" + price);
        if (audio.getLanguageAudioFilms() == null) {
            stringJoiner.add("audio not selected");
        } else {
            stringJoiner.add(String.valueOf(audio));
        }
        if (subtitle.getLanguageSubtitle() == null) {
            stringJoiner.add("subtitle not selected");
        } else {
            stringJoiner.add(String.valueOf(subtitle));
        }
        return stringJoiner.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTiming() {
        return timing;
    }

    public void setTiming(double timing) {
        this.timing = timing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }
}
