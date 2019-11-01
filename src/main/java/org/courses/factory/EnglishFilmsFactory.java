package org.courses.factory;

import org.courses.AbstractFactory;
import org.courses.audio.Audio;
import org.courses.audio.EnglishAudio;
import org.courses.subtitle.EnglishSubtitle;
import org.courses.subtitle.Subtitle;

public class EnglishFilmsFactory extends AbstractFactory {

    @Override
    public Audio createAudio() {
        return new EnglishAudio();
    }

    @Override
    public Subtitle createSubtitle() {
        return new EnglishSubtitle();
    }
}
