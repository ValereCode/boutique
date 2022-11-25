/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entites;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author setod
 */
public class Produit implements Serializable {
    // Déclaration des attributs d'instances
    private long id;
    private String libelle;
    private double prixUnitaire;
    private Date datePeremtion;
    private Categorie categorie;
    
    //==========================================================================
    // Déclaration des constructeurs
    public Produit() {
        
    }

    public Produit(long id, String libelle, double prixUnitaire, Date datePeremtion, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.categorie = categorie;
    }
    
    //==========================================================================
    public boolean estPerime() {
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);
        return today.after(this.datePeremtion);
    }
    
    public boolean estPerime(Date dateReference) {
        return dateReference.compareTo(this.datePeremtion) == 1;
    }

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

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Date getDatePeremtion() {
        return datePeremtion;
    }

    public void setDatePeremtion(Date datePeremtion) {
        this.datePeremtion = datePeremtion;
    }
    
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    //==========================================================================
    // Le hashCode et le equals sur l'attribut id
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    //==========================================================================
    // La méthode toString
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prixUnitaire=" + prixUnitaire + ", datePeremtion=" + datePeremtion + ", categorie=" + categorie + '}';
    } 
    
}
