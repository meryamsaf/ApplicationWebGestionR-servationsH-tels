/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.beans;

import java.util.Date;

/**
 *
 * @author meryam
 */
public class Reservation {
  
    private Date date_reser_debut;
     private String typeCham;
 private int id;
    private String nomhotel;
    private String id_client;
  private int nbrJour;
    private int nbre_personne;

    public String getTypeCham() {
        return typeCham;
    }

    public void setTypeCham(String typeCham) {
        this.typeCham = typeCham;
    }

    public String getNomhotel() {
        return nomhotel;
    }

    public void setNomhotel(String nomhotel) {
        this.nomhotel = nomhotel;
    }

    
 

    public Date getDate_reser_debut() {
        return date_reser_debut;
    }

    public void setDate_reser_debut(Date date_reser_debut) {
        this.date_reser_debut = date_reser_debut;
    }

  


    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }



    public int getNbre_personne() {
        return nbre_personne;
    }

    public void setNbre_personne(int nbre_personne) {
        this.nbre_personne = nbre_personne;
    }

    public Reservation(String id_client, String typeCham,String nomHotel,int nbre_personne, int nbrJour,Date date_reser_debut) {
      
        this.date_reser_debut = date_reser_debut;
       this.nbrJour=nbrJour;
       this.typeCham=typeCham;
        this.nomhotel = nomHotel;
        this.id_client = id_client;
        this.nbre_personne = nbre_personne;
    }

    public int getNbrJour() {
        return nbrJour;
    }

    public void setNbrJour(int nbrJour) {
        this.nbrJour = nbrJour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation(int id,String id_client,String nomhotel,String typeCham,int nbrJour,int nbre_personne,Date date_reser_debut) {
        this.date_reser_debut = date_reser_debut;
        this.typeCham = typeCham;
        this.id = id;
        this.nomhotel = nomhotel;
        this.id_client = id_client;
        this.nbrJour = nbrJour;
        this.nbre_personne = nbre_personne;
    }

  
    
    
    
    
    public Reservation(){}

   
}
