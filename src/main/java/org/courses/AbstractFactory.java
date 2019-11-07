package org.courses;

import org.courses.audio.Audio;
import org.courses.subtitle.Subtitle;

public abstract class AbstractFactory {
    public abstract Audio createAudio();

    public abstract Subtitle createSubtitle();
}
