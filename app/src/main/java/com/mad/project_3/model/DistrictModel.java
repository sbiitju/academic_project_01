package com.mad.project_3.model;

public class DistrictModel {
    private String districtName,districtDescription;

    public DistrictModel(String districtName, String districtDescription) {
        this.districtName = districtName;
        this.districtDescription = districtDescription;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictDescription() {
        return districtDescription;
    }

    public void setDistrictDescription(String districtDescription) {
        this.districtDescription = districtDescription;
    }
}
