package com.tv2.restepgservice.models;

public class Programguiderecord {

    private String oid;
    private String chn_id;
    private String broadcastdate;
    private String start_timestamp_announced;
    private String stop_timestamp_announced;
    private String title_announced;
    private String content_isrerun;
    private String description;

    public Programguiderecord() {
    }

    public Programguiderecord(String oid, String chn_id, String broadcastdate, String start_timestamp_announced, String stop_timestamp_announced, String title_announced, String content_isrerun, String description) {
        this.oid = oid;
        this.chn_id = chn_id;
        this.broadcastdate = broadcastdate;
        this.start_timestamp_announced = start_timestamp_announced;
        this.stop_timestamp_announced = stop_timestamp_announced;
        this.title_announced = title_announced;
        this.content_isrerun = content_isrerun;
        this.description = description;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getChn_id() {
        return chn_id;
    }

    public void setChn_id(String chn_id) {
        this.chn_id = chn_id;
    }

    public String getBroadcastdate() {
        return broadcastdate;
    }

    public void setBroadcastdate(String broadcastdate) {
        this.broadcastdate = broadcastdate;
    }

    public String getStart_timestamp_announced() {
        return start_timestamp_announced;
    }

    public void setStart_timestamp_announced(String start_timestamp_announced) {
        this.start_timestamp_announced = start_timestamp_announced;
    }

    public String getStop_timestamp_announced() {
        return stop_timestamp_announced;
    }

    public void setStop_timestamp_announced(String stop_timestamp_announced) {
        this.stop_timestamp_announced = stop_timestamp_announced;
    }

    public String getTitle_announced() {
        return title_announced;
    }

    public void setTitle_announced(String title_announced) {
        this.title_announced = title_announced;
    }

    public String getContent_isrerun() {
        return content_isrerun;
    }

    public void setContent_isrerun(String content_isrerun) {
        this.content_isrerun = content_isrerun;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Programguiderecords{" +
                "oid='" + oid + '\'' +
                ", chn_id='" + chn_id + '\'' +
                ", broadcastdate='" + broadcastdate + '\'' +
                ", start_timestamp_announced='" + start_timestamp_announced + '\'' +
                ", stop_timestamp_announced='" + stop_timestamp_announced + '\'' +
                ", title_announced='" + title_announced + '\'' +
                ", content_isrerun='" + content_isrerun + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
