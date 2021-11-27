package com.tv2.restepgservice.models;

import java.util.Arrays;

public class Programguide {

    //private Channel[] channels;
    private Programguiderecord[] programguiderecord;

    public Programguide() {
    }

    public Programguide(Programguiderecord[] programguiderecord) {
        this.programguiderecord = programguiderecord;
    }

    public Programguiderecord[] getProgramguiderecord() {
        return programguiderecord;
    }

    public void setProgramguiderecord(Programguiderecord[] programguiderecord) {
        this.programguiderecord = programguiderecord;
    }

    @Override
    public String toString() {
        return "Programguide{" +
                "programguiderecord=" + Arrays.toString(programguiderecord) +
                '}';
    }
}
