package com.tv2.restepgservice.models;

public class Program {
    private String title;
    private String punchline;
    private String description;
    private String ext_id;

    public Program() {
    }

    public Program(String title, String punchline, String description, String ext_id) {
        this.title = title;
        this.punchline = punchline;
        this.description = description;
        this.ext_id = ext_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Program{" +
                "title='" + title + '\'' +
                ", punchline='" + punchline + '\'' +
                ", description='" + description + '\'' +
                ", ext_id='" + ext_id + '\'' +
                '}';
    }
}
