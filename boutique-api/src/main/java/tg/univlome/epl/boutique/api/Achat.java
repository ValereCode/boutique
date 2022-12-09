/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author setod
 */
public class Achat implements Serializable{
    private long id;
    private LocalDate dateAchat;
    private double remise;
    private List<ProduitAchete> listeAchat;
    private Employe employe;
    private Client client;
    
    //==========================================================================
    // Déclaration des constructeurs
    public Achat() {
    }
    
    public Achat(long id, LocalDate date, double remise) {
        this.id = id;
        this.dateAchat = date;
        this.remise = remise;
    }

    public Achat(long id, LocalDate dateAchat, double remise, List<ProduitAchete> listeAchat, Employe employe, Client client) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.listeAchat = listeAchat;
        this.employe = employe;
        this.client = client;
    }
    
    //==========================================================================
    public double getRemiseTotale() {
        double rTotale = 0; 
        if (listeAchat != null) {
            for(ProduitAchete p : listeAchat) {
                rTotale += p.getRemise();
            }
        }       
        return rTotale;
    }
    
    public double getTotalAPayer() {
        double pTotale = 0;
        if (listeAchat != null) {
            for(ProduitAchete p : listeAchat) {
                pTotale += p.getProduit().getPrixUnitaire();
            }
        }
        return pTotale;
    }

    //==========================================================================
    // Déclaration des acesseurs
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public List<ProduitAchete> getListeAchat() {
        return listeAchat;
    }

    public void setListeAchat(List<ProduitAchete> listeAchat) {
        this.listeAchat = listeAchat;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //==========================================================================
    // Le hashCode et le equals sur l'attribut id
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }
    
    //==========================================================================
    // La méthode toString
    @Override
    public String toString() {
        return "Achat{" + "id=" + id + ", dateAchat=" + dateAchat + ", remise=" + remise + ", listeAchat=" + listeAchat + ", employe=" + employe + ", client=" + client + '}';
    }
     
}
