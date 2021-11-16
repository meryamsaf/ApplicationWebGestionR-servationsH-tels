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
public class Commentaire {
    private int id;
    private String cin;
    private String nom;
    private String prenom;
    private String phone;
    private String mail;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Commentaire(int id, String cin, String nom, String prenom, String phone, String mail, String message) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.mail = mail;
        this.message = message;
    }
    
    public Commentaire(){
    }

    public Commentaire(String cin, String nom, String prenom, String phone, String mail, String message) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.mail = mail;
        this.message = message;
    }
    
    
    
}
