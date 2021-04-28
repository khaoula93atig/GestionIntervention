package com.example.interventions;

public class intervention {
    private String titreInterv;
    private String client;
    private String adressClient;
    private String heureInterv;
    private Boolean termine;


    public intervention(String titreInterv, String client, String adressClient, String heureInterv, Boolean termine) {
        this.titreInterv = titreInterv;
        this.client = client;
        this.adressClient = adressClient;
        this.heureInterv = heureInterv;
        this.termine = termine;
    }

    public String getTitreInterv() {
        return titreInterv;
    }

    public void setTitreInterv(String titreInterv) {
        this.titreInterv = titreInterv;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public String getHeureInterv() {
        return heureInterv;
    }

    public void setHeureInterv(String heureInterv) {
        this.heureInterv = heureInterv;
    }

    public Boolean getTermine() {
        return termine;
    }

    public void setTermine(Boolean termine) {
        this.termine = termine;
    }
}
