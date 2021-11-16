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
public class Chambre {
    private int id_chambre;
    private int id_hot;
    private String type_chambre;
    private int numero_cham;
    private String prix_unitaire;
    private boolean disponible;
    private String detailsChambre;

    public Chambre(int id_chambre, int id_hot, String type_chambre, int numero_cham, String prix_unitaire, boolean disponible, String detailsChambre) {
        this.id_chambre = id_chambre;
        this.id_hot = id_hot;
        this.type_chambre = type_chambre;
        this.numero_cham = numero_cham;
        this.prix_unitaire = prix_unitaire;
        this.disponible = disponible;
        this.detailsChambre = detailsChambre;
    }
public Chambre(){}
    
    public int getId_chambre() {
        return id_chambre;
    }

    public void setId_chambre(int id_chambre) {
        this.id_chambre = id_chambre;
    }

    public int getId_hot() {
        return id_hot;
    }

    public void setId_hot(int id_hot) {
        this.id_hot = id_hot;
    }

    public String getType_chambre() {
        return type_chambre;
    }

    public void setType_chambre(String type_chambre) {
        this.type_chambre = type_chambre;
    }

    public int getNumero_cham() {
        return numero_cham;
    }

    public void setNumero_cham(int numero_cham) {
        this.numero_cham = numero_cham;
    }

    public String getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(String prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDetailsChambre() {
        return detailsChambre;
    }

    public void setDetailsChambre(String detailsChambre) {
        this.detailsChambre = detailsChambre;
    }
}
