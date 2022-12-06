/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.ProduitAchete;

/**
 *
 * @author setodji
 */
public class ProduitAcheteService {
    
    private static List<ProduitAchete> listeProduitAchetes = new LinkedList<>();
    public static ProduitAcheteService instance = null;
    
    //==========================================================================
    
    public ProduitAcheteService() {
        
    }
    
    public synchronized static ProduitAcheteService getInstance() {
        if(instance == null) {
            instance = new ProduitAcheteService();
            listeProduitAchetes.add(new ProduitAchete(0, null));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(ProduitAchete pa) {
        listeProduitAchetes.add(pa);
    }

    public void modifier(ProduitAchete pa) {
        int i = listeProduitAchetes.indexOf(pa);
        if (i >= 0) {
            listeProduitAchetes.set(i, pa);
        }
    }

    public void supprimer(String libelle) {
        ProduitAchete pa2 = this.trouver(libelle);
        if (pa2 != null) {
            listeProduitAchetes.remove(pa2);
        }
    }

    public ProduitAchete trouver(String libelle) {
        for (ProduitAchete produit : listeProduitAchetes) {
            if (produit.getProduit().getLibelle().equals(libelle)) {
                return produit;
            }
        }
        return null;
    }

    public int compter() {
        return listeProduitAchetes.size();
    }

    public List<ProduitAchete> lister() {
        return listeProduitAchetes;
    }
    
}
