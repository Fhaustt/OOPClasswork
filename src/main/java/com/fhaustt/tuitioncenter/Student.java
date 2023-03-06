package com.fhaustt.tuitioncenter;

import java.util.List;

public class Student {


    String name;
    private String ic;
    private String address;
    private int year;
    private String schoolName;
    private List<Double> scores;

    public Student(String name, String ic, String address, int year, String schoolName, List<Double> scores) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setScores(List<Double> scores) {
        this.scores = scores;
    }

    public List<Double> getScores() {
        return scores;
    }
}

