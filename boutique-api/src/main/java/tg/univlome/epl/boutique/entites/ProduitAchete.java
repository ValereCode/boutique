/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entites;

import java.io.Serializable;
/**
 *
 * @author setod
 */
public class ProduitAchete implements Serializable{
    private double remise; 
    private Produit produit;

    //==========================================================================
    // Déclaration des constructeurs
    public ProduitAchete() {
    }

    public ProduitAchete(double remise, Produit produit) {
        this.remise = remise;
        this.produit = produit;
    }

    //==========================================================================
    // Déclaration des acesseurs
    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    //==========================================================================
    // La méthode toString
    @Override
    public String toString() {
        return "ProduitAchete{" + "remise=" + remise + ", produit=" + produit + '}';
    }
    
}
