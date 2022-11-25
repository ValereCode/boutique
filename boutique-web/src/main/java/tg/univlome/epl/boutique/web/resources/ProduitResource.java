/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.web.resources;

import java.util.List;
import tg.univlome.epl.boutique.entites.Produit;
import tg.univlome.epl.boutique.service.ProduitService;

/**
 *
 * @author setodji
 */
public class ProduitResource {

    private ProduitService service;

    public ProduitResource() {
        this.service = ProduitService.getInstance();
    }

    public void modifier(Produit p) {
        int i = service.lister().indexOf(p);
        if (i >= 0) {
            service.lister().set(i, p);
        }
    }

    public void supprimer(long id) {
        Produit p2 = service.trouver(id);
        if (p2 != null) {
            service.lister().remove(p2);
        }
    }

    public int compter() {
        return service.lister().size();
    }

    public List<Produit> lister() {
        return service.lister();
    }

}
