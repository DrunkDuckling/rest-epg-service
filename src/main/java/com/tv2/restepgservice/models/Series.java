package com.tv2.restepgservice.models;

public class Series {

    private String ext_id;
    private String title;
    private String episode_count;
    private String punchline;
    private String productionyear;
    private String season_number;

    public Series() {
    }

    public Series(String ext_id, String title, String episode_count, String punchline, String productionyear, String season_number) {
        this.ext_id = ext_id;
        this.title = title;
        this.episode_count = episode_count;
        this.punchline = punchline;
        this.productionyear = productionyear;
        this.season_number = season_number;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode_count() {
        return episode_count;
    }

    public void setEpisode_count(String episode_count) {
        this.episode_count = episode_count;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getProductionyear() {
        return productionyear;
    }

    public void setProductionyear(String productionyear) {
        this.productionyear = productionyear;
    }

    public String getSeason_number() {
        return season_number;
    }

    public void setSeason_number(String season_number) {
        this.season_number = season_number;
    }

    @Override
    public String toString() {
        return "Serieslist{" +
                "ext_id='" + ext_id + '\'' +
                ", title='" + title + '\'' +
                ", episode_count='" + episode_count + '\'' +
                ", punchline='" + punchline + '\'' +
                ", productionyear='" + productionyear + '\'' +
                ", season_number='" + season_number + '\'' +
                '}';
    }
}
