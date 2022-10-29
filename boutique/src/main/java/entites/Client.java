/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author setod
 */
public class Client extends Personne implements Serializable {
    private List<Achat> listeAchat;

    //==========================================================================
    // Déclaration des constructeurs
    public Client() {
    }

    public Client(List<Achat> listeAchat) {
        this.listeAchat = listeAchat;
    }
    
    //==========================================================================
    // Déclaration des acesseurs
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
        return "Client{" + "listeAchat=" + listeAchat + '}';
    }
    
}
