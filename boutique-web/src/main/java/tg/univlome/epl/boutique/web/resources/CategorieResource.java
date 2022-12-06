/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.web.resources;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import tg.univlome.epl.boutique.api.Categorie;
import tg.univlome.epl.boutique.service.CategorieService;

/**
 *
 * @author setodji
 */
@Path("/categorie")
public class CategorieResource {
    
    private CategorieService service;

    public CategorieResource() {
        this.service = CategorieService.getInstance();
    }
    
    @PUT
    public void ajouter(Categorie categorie) {
        this.service.ajouter(categorie);
    } 

    @POST
    public void modifier(Categorie categorie) {
        this.service.modifier(categorie);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Categorie trouver(long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Path("/liste")
    public List<Categorie> lister() {
        return service.lister();
    }
    
}
