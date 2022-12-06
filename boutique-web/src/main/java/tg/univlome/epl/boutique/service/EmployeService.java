/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Employe;

/**
 *
 * @author setodji
 */
public class EmployeService {
    
    private static List<Employe> listeEmployes = new LinkedList<>();
    public static EmployeService instance = null;
    
    //==========================================================================
    
    public EmployeService() {
        
    }
    
    public synchronized static EmployeService getInstance() {
        if(instance == null) {
            instance = new EmployeService();
            listeEmployes.add(new Employe(new Date(), null));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(Employe employe) {
        listeEmployes.add(employe);
    }

    public void modifier(Employe employe) {
        int i = listeEmployes.indexOf(employe);
        if (i >= 0) {
            listeEmployes.set(i, employe);
        }
    }

    public void supprimer(long id) {
        Employe employe2 = this.trouver(id);
        if (employe2 != null) {
            listeEmployes.remove(employe2);
        }
    }

    public Employe trouver(long id) {
        for (Employe employe : listeEmployes) {
            if (employe.getId() == id) {
                return employe;
            }
        }
        return null;
    }

    public int compter() {
        return listeEmployes.size();
    }

    public List<Employe> lister() {
        return listeEmployes;
    }
    
}
