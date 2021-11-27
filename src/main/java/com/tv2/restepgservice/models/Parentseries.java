package com.tv2.restepgservice.models;

public class Parentseries {

    private String ext_id;
    private String type;
    private String title;
    private String season_count;

    public Parentseries() {
    }

    public Parentseries(String ext_id, String type, String title, String season_count) {
        this.ext_id = ext_id;
        this.type = type;
        this.title = title;
        this.season_count = season_count;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeason_count() {
        return season_count;
    }

    public void setSeason_count(String season_count) {
        this.season_count = season_count;
    }

    @Override
    public String toString() {
        return "Parentseries{" +
                "ext_id='" + ext_id + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", season_count='" + season_count + '\'' +
                '}';
    }
}
