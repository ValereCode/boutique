/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Categorie;

/**
 *
 * @author setodji
 */
public class CategorieService {
    
    private static List<Categorie> listeCategories = new LinkedList<>();
    public static CategorieService instance = null;
    
    //==========================================================================
    public CategorieService() {
        
    }
    
    public synchronized static CategorieService getInstance() {
        if(instance == null) {
            instance = new CategorieService();
            listeCategories.add(new Categorie(1, "", "", null));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(Categorie categorie) {
        listeCategories.add(categorie);
    }

    public void modifier(Categorie categorie) {
        int i = listeCategories.indexOf(categorie);
        if (i >= 0) {
            listeCategories.set(i, categorie);
        }
    }

    public void supprimer(long id) {
        Categorie categorie2 = this.trouver(id);
        if (categorie2 != null) {
            listeCategories.remove(categorie2);
        }
    }

    public Categorie trouver(long id) {
        for (Categorie categorie : listeCategories) {
            if (categorie.getId() == id) {
                return categorie;
            }
        }
        return null;
    }

    public int compter() {
        return listeCategories.size();
    }

    public List<Categorie> lister() {
        return listeCategories;
    }
    
}
