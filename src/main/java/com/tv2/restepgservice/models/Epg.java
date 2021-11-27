package com.tv2.restepgservice.models;

import java.util.Arrays;

public class Epg {

    private Channel[] channels;
    private Program[] programlist;
    private Series[] serieslist;
    private Parentseries[] parentserieslist;
    private Programguides programguide;

    public Epg() {
    }

    public Epg(Channel[] channels, Program[] programlist, Series[] serieslist, Parentseries[] parentserieslist, Programguides programguide) {
        this.channels = channels;
        this.programlist = programlist;
        this.serieslist = serieslist;
        this.parentserieslist = parentserieslist;
        this.programguide = programguide;
    }

    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public Program[] getProgramlist() {
        return programlist;
    }

    public void setProgramlist(Program[] programlist) {
        this.programlist = programlist;
    }

    public Series[] getSerieslist() {
        return serieslist;
    }

    public void setSerieslist(Series[] serieslist) {
        this.serieslist = serieslist;
    }

    public Parentseries[] getParentserieslist() {
        return parentserieslist;
    }

    public void setParentserieslist(Parentseries[] parentserieslist) {
        this.parentserieslist = parentserieslist;
    }

    public Programguides getProgramguide() {
        return programguide;
    }

    public void setProgramguide(Programguides programguide) {
        this.programguide = programguide;
    }

    @Override
    public String toString() {
        return "Epg{" +
                "channels=" + Arrays.toString(channels) +
                ", programlist=" + Arrays.toString(programlist) +
                ", serieslist=" + Arrays.toString(serieslist) +
                ", parentserieslist=" + Arrays.toString(parentserieslist) +
                ", programguide=" + programguide +
                '}';
    }
}
