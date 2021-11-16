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
public class Hotel {
   private int id_hotel;
   private String nom_hotel;
   private String location;
   private String services;
   private int etoile;
  private String ville;
   private String telephone_hotel;
  private String CinHotelier;

    public String getCinHotelier() {
        return CinHotelier;
    }

    public void setCinHotelier(String CinHotelier) {
        this.CinHotelier = CinHotelier;
    }
   
    public Hotel(){}
   
    public Hotel(int id_hotel, String nom_hotel, String location, String services_hotel, int etoile, String ville, String telephone_hotel,String CinHotelier ) {
        this.id_hotel = id_hotel;
        this.nom_hotel = nom_hotel;
        this.location = location;
        this.services = services_hotel;
        this.etoile = etoile;
        this.ville = ville;
        this.telephone_hotel = telephone_hotel;
          this.CinHotelier=CinHotelier;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public String getNom_hotel() {
        return nom_hotel;
    }

    public void setNom_hotel(String nom_hotel) {
        this.nom_hotel = nom_hotel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services_hotel) {
        this.services = services_hotel;
    }

    public int getEtoile() {
        return etoile;
    }

    public void setEtoile(int etoile) {
        this.etoile = etoile;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone_hotel() {
        return telephone_hotel;
    }

    public void setTelephone_hotel(String telephone_hotel) {
        this.telephone_hotel = telephone_hotel;
    }

}
