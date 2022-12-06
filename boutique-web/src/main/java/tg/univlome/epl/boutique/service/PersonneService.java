/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Personne;

/**
 *
 * @author setodji
 */
public class PersonneService {
    
    private static List<Personne> listePersonnes = new LinkedList<>();
    public static PersonneService instance = null;
    
    //==========================================================================
    
    public PersonneService() {
        
    }
    
    public synchronized static PersonneService getInstance() {
        if(instance == null) {
            instance = new PersonneService();
            listePersonnes.add(new Personne(1, "", ""));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(Personne personne) {
        listePersonnes.add(personne);
    }

    public void modifier(Personne personne) {
        int i = listePersonnes.indexOf(personne);
        if (i >= 0) {
            listePersonnes.set(i, personne);
        }
    }

    public void supprimer(long id) {
        Personne personne2 = this.trouver(id);
        if (personne2 != null) {
            listePersonnes.remove(personne2);
        }
    }

    public Personne trouver(long id) {
        for (Personne personne : listePersonnes) {
            if (personne.getId() == id) {
                return personne;
            }
        }
        return null;
    }

    public int compter() {
        return listePersonnes.size();
    }

    public List<Personne> lister() {
        return listePersonnes;
    }
    
}
