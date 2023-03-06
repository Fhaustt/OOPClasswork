package com.fhaustt.tuitioncenter;
import java.time.LocalDate;

public class Tutor {
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private LocalDate dateJoined;
    private int yearsInCenter;

    public Tutor(String name, String ic, String address, String qualification, int yearsOfExperience, LocalDate dateJoined, int yearsInCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }

    public void setYearsInCenter(int yearsInCenter) {
        this.yearsInCenter = yearsInCenter;
    }
}

