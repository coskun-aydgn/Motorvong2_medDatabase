package org.example.motorvong2_meddatabase;

public class Motorvogn {
    private String eierPersonNr,eiersNavn,
            eiersAdresse,kjennetegn, bilMerke,biltype;

    public Motorvogn(String eierPersonNr, String eiersNavn, String eiersAdresse,
                     String kjennetegn, String bilMerke, String biltype) {
        this.eierPersonNr = eierPersonNr;
        this.eiersNavn = eiersNavn;
        this.eiersAdresse = eiersAdresse;
        this.kjennetegn = kjennetegn;
        this.bilMerke = bilMerke;
        this.biltype = biltype;
    }

    public String getEierPersonNr() {
        return eierPersonNr;
    }

    public void setEierPersonNr(String eierPersonNr) {
        this.eierPersonNr = eierPersonNr;
    }

    public String getEiersNavn() {
        return eiersNavn;
    }

    public void setEiersNavn(String eiersNavn) {
        this.eiersNavn = eiersNavn;
    }

    public String getEiersAdresse() {
        return eiersAdresse;
    }

    public void setEiersAdresse(String eiersAdresse) {
        this.eiersAdresse = eiersAdresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public String getBilMerke() {
        return bilMerke;
    }

    public void setBilMerke(String bilMerke) {
        this.bilMerke = bilMerke;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

}
