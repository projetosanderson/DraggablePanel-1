package com.test.english.ui.data;

public class SingleItemModel {

    private String sentence;
    private String vtitle;
    private String item_thumbnail;
    private String time;

    public SingleItemModel(String sentence, String vtitle, String item_thumbnail, String time) {
        this.sentence = sentence;
        this.vtitle = vtitle;
        this.item_thumbnail = item_thumbnail;
        this.time = time;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getVtitle() {
        return vtitle;
    }

    public void setVtitle(String vtitle) {
        this.vtitle = vtitle;
    }

    public String getItem_thumbnail() {
        return item_thumbnail;
    }

    public void setItem_thumbnail(String item_thumbnail) {
        this.item_thumbnail = item_thumbnail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
