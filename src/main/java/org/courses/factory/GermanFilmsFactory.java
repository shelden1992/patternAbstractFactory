package org.courses.factory;

import org.courses.AbstractFactory;
import org.courses.audio.Audio;
import org.courses.audio.GermanAudio;
import org.courses.subtitle.GermanSubtitle;
import org.courses.subtitle.Subtitle;

public class GermanFilmsFactory extends AbstractFactory {

    @Override
    public Audio createAudio() {
        return new GermanAudio();
    }

    @Override
    public Subtitle createSubtitle() {
        return new GermanSubtitle();
    }
}
