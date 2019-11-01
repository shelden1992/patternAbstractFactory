package org.courses.factory;

import org.courses.AbstractFactory;
import org.courses.audio.Audio;
import org.courses.audio.UkrainianAudio;
import org.courses.subtitle.Subtitle;
import org.courses.subtitle.UkrainianSubtitle;

public class UkrainianFilmsFactory extends AbstractFactory {

    @Override
    public Audio createAudio() {
        return new UkrainianAudio();
    }

    @Override
    public Subtitle createSubtitle() {
        return new UkrainianSubtitle();
    }
}
