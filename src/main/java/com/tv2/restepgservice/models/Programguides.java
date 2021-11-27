package com.tv2.restepgservice.models;

import java.util.Arrays;

public class Programguides {

    private Programguiderecord[] programguiderecords;

    public Programguides() {
    }

    public Programguides(Programguiderecord[] programguiderecords) {
        this.programguiderecords = programguiderecords;
    }

    public Programguiderecord[] getProgramguiderecords() {
        return programguiderecords;
    }

    public void setProgramguiderecords(Programguiderecord[] programguiderecords) {
        this.programguiderecords = programguiderecords;
    }

    @Override
    public String toString() {
        return "Programguides{" +
                "programguiderecords=" + Arrays.toString(programguiderecords) +
                '}';
    }
}
