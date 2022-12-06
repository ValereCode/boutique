/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Produit;

/**
 *
 * @author setodji
 */
public class ProduitService {

    private static List<Produit> liste = new LinkedList<>();
    private static ProduitService instance = null;

    private ProduitService() {
       
    }

    public synchronized static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    public void ajouter(Produit p) {
        liste.add(p);
    }

    public void modifier(Produit p) {
        int i = liste.indexOf(p);
        if (i >= 0) {
            liste.set(i, p);
        }
    }

    public void supprimer(long id) {
        Produit p2 = this.trouver(id);
        if (p2 != null) {
            liste.remove(p2);
        }
    }

    public Produit trouver(long id) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public List<Produit> lister() {
        return liste;
    }

}
