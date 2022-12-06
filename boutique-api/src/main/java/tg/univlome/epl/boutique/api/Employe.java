/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author setod
 */
public class Employe extends Personne implements Serializable {
    private Date dateNaissance;
    private List<Achat> listeAchat;

    //==========================================================================
    // Déclaration des constructeurs
    public Employe() {
    }

    public Employe(Date dateNaissance, List<Achat> listeAchat) {
        this.dateNaissance = dateNaissance;
        this.listeAchat = listeAchat;
    }
    
    //==========================================================================
    // Déclaration des acesseurs
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<Achat> getListeAchat() {
        return listeAchat;
    }

    public void setListeAchat(List<Achat> listeAchat) {
        this.listeAchat = listeAchat;
    }
    
    //==========================================================================
    // La méthode toString
    @Override
    public String toString() {
        return "Employe{" + "dateNaissance=" + dateNaissance + ", listeAchat=" + listeAchat + '}';
    }
    
}
