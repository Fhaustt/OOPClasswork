package com.fhaustt.tuitioncenter;

import java.util.ArrayList;
import java.util.List;

public class PandaiSdnBhd {
    private List<TuitionCenter> tuitionCenters;

    public PandaiSdnBhd() {
        this.tuitionCenters = new ArrayList<>();
    }

    public void addTuitionCenter(TuitionCenter center) {
        tuitionCenters.add(center);
    }

    public void removeTuitionCenter(TuitionCenter center) {
        tuitionCenters.remove(center);
    }

    public List<TuitionCenter> getTuitionCenters() {
        return tuitionCenters;
    }
}
