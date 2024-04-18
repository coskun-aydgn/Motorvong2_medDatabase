package org.example.motorvong2_meddatabase;

public class Bil {
    private String bilMerke,bilType;

    public Bil(String bilMerke, String bilType) {
        this.bilMerke = bilMerke;
        this.bilType = bilType;
    }

    public String getBilMerke() {
        return bilMerke;
    }

    public void setBilMerke(String bilMerke) {
        this.bilMerke = bilMerke;
    }

    public String getBilType() {
        return bilType;
    }

    public void setBilType(String bilType) {
        this.bilType = bilType;
    }
}
