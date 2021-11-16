/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.beans;

/**
 *
 * @author meryam
 */
public class Personne {
    
    private String CIN;
    private String NOM;
    private String PRENOM;
    private String TELEPHONE;
    private String MAIL;
    private String ADRESS;
    private int STATU;
    private String PASSWORD;
    

    public Personne(String CIN, String NOM, String PRENOM, String TELEPHONE, String MAIL, String ADRESSE, String PASSWORD,int STATU) {
        this.CIN = CIN;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.TELEPHONE = TELEPHONE;
        this.MAIL = MAIL;
        this.ADRESS = ADRESSE;
        this.PASSWORD = PASSWORD;
        this.STATU=STATU;
    }
      public Personne(){}

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getADRESS() {
        return ADRESS;
    }

    public void setADRESS(String ADRESSE) {
        this.ADRESS = ADRESSE;
    }

    public int getSTATU() {
        return STATU;
    }

    public void setSTATU(int STATU) {
        this.STATU = STATU;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    
   
}
