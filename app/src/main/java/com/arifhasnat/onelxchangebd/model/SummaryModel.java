package com.arifhasnat.onelxchangebd.model;

public class SummaryModel {
    public String name;
    public  String title;

    public SummaryModel(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SummaryModel{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
