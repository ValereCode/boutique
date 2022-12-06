/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Achat;


/**
 *
 * @author setodji
 */
public class AchatService {
    
    private static List<Achat> listeAchats = new LinkedList<>();
    public static AchatService instance = null;
    
    //==========================================================================
    
    public AchatService() {
        
    }
    
    public synchronized static AchatService getInstance() {
        if(instance == null) {
            instance = new AchatService();
            listeAchats.add(new Achat(1, LocalDate.now(), 0, null, null, null));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(Achat achat) {
        listeAchats.add(achat);
    }

    public void modifier(Achat achat) {
        int i = listeAchats.indexOf(achat);
        if (i >= 0) {
            listeAchats.set(i, achat);
        }
    }

    public void supprimer(long id) {
        Achat achat2 = this.trouver(id);
        if (achat2 != null) {
            listeAchats.remove(achat2);
        }
    }

    public Achat trouver(long id) {
        for (Achat achat : listeAchats) {
            if (achat.getId() == id) {
                return achat;
            }
        }
        return null;
    }

    public int compter() {
        return listeAchats.size();
    }

    public List<Achat> lister() {
        return listeAchats;
    }

}
