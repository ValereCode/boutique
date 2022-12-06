/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.service;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import tg.univlome.epl.boutique.api.Client;

/**
 *
 * @author setodji
 */
public class ClientService {
    
    private static List<Client> listeClients = new LinkedList<>();
    public static ClientService instance = null;
    
    //==========================================================================
    
    public ClientService() {
        
    }
    
    public synchronized static ClientService getInstance() {
        if(instance == null) {
            instance = new ClientService();
            listeClients.add(new Client(null));
        }
        return instance;
    }
    
    //==========================================================================
    
    public void ajouter(Client client) {
        listeClients.add(client);
    }

    public void modifier(Client client) {
        int i = listeClients.indexOf(client);
        if (i >= 0) {
            listeClients.set(i, client);
        }
    }

    public void supprimer(long id) {
        Client client2 = this.trouver(id);
        if (client2 != null) {
            listeClients.remove(client2);
        }
    }

    public Client trouver(long id) {
        for (Client client : listeClients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    public int compter() {
        return listeClients.size();
    }

    public List<Client> lister() {
        return listeClients;
    }
    
}
