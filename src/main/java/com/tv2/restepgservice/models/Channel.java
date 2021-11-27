package com.tv2.restepgservice.models;

public class Channel {

    private String type;
    private String chn_id;
    private String ext_id;
    private String chn_name;

    public Channel() {
    }

    public Channel(String type, String channel_id, String chn_name) {
        this.type = type;
        this.chn_id = channel_id;
        this.chn_name = chn_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getChn_id() {
        return chn_id;
    }

    public void setChn_id(String chn_id) {
        this.chn_id = chn_id;
    }

    public String getChn_name() {
        return chn_name;
    }

    public void setChn_name(String chn_name) {
        this.chn_name = chn_name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "type='" + type + '\'' +
                ", chn_id='" + chn_id + '\'' +
                ", chn_name='" + chn_name + '\'' +
                '}';
    }
}
