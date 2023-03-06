package com.fhaustt.tuitioncenter;

import java.util.Date;

public class HeadMaster {
    private String name;
    private String ic;
    private String address;
    private Date dateJoined;
    private int yearsInCenter;

    public HeadMaster(String name, String ic, String address, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public void setYearsInCenter(int yearsInCenter) {
        this.yearsInCenter = yearsInCenter;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }


}
