/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.web.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import tg.univlome.epl.boutique.api.Produit;
import tg.univlome.epl.boutique.service.ProduitService;

/**
 *
 * @author setodji
 */
@Path("/rs")
public class ProduitResource {

    private ProduitService service;

    //@GET
    public ProduitResource() {
        this.service = ProduitService.getInstance();
    }
    
    @PUT
    @Consumes({"application/json", "application/xml"})
    public void ajouter(Produit p) {
        this.service.ajouter(p);
    } 

    @POST
    public void modifier(Produit p) {
        this.service.modifier(p);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Produit trouver(long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Path("/liste")
    @Produces({"application/json", "application/xml"})
    public List<Produit> lister() {
        return service.lister();
    }

}
