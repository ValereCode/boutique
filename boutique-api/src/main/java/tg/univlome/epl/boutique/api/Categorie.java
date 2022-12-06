/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author setod
 */
public class Categorie implements Serializable {
    private long id;
    private String libelle;
    private String description;
    private List<Produit> listeProduits;

    //==========================================================================
    // Les constructeurs
    public Categorie() {
    }

    public Categorie(long id, String libelle, String description, List<Produit> listeProduits) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.listeProduits = listeProduits;
    }
    //==========================================================================
    
    //    if (this.id == ID) {
    //        return
    //    }
    //}
    
    //==========================================================================
    // Déclaration des acesseurs
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Produit> getListeProduits() {
        return listeProduits;
    }

    public void setListeProduits(List<Produit> listeProduits) {
        this.listeProduits = listeProduits;
    }

    //==========================================================================
    // Le hashCode et le equals sur l'attribut id
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categorie other = (Categorie) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + ", listeProduits=" + listeProduits + '}';
    }   
    
}
