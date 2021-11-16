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
public class Client  extends Personne {
   
      private String cin;
    private String nom;
    private String prenom;
    private String telephone;
    private String adress;
    private String mail;
    private String password;
    private int statu;
    

    

 

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int status) {
        this.statu = status;
    }

    public Client(String cin, String nom, String prenom, String telephone, String adress, String mail, String password ,int statu) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adress = adress;
        this.mail = mail;
        this.password = password;
        this.statu=statu;
    }
    public Client(){}

    public Client(String cin, String nom, String prenom, String telephone, String adress, String mail, String password) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adress = adress;
        this.mail = mail;
        this.password = password;
    }
     
}