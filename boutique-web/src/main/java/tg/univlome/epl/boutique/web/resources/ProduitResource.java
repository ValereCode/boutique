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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import tg.univlome.epl.boutique.api.Produit;
import tg.univlome.epl.boutique.service.ProduitService;

/**
 *
 * @author setodji
 */
@Path("/produit")
public class ProduitResource {

    private ProduitService service;

    //@GET
    public ProduitResource() {
        this.service = ProduitService.getInstance();
    }
    
    @PUT
    //@Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void ajouter(Produit p) {
        this.service.ajouter(p);
    } 

    @POST
    //@Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void modifier(Produit p) {
        this.service.modifier(p);
    }

    @DELETE
    @Path("/{id}")
    //@Consumes({"application/json", "application/xml"})
    public void supprimer(@PathParam("id") long id) {
        this.service.supprimer(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Produit trouver(@PathParam("id") long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    //@Produces({"application/json", "application/xml"})
    public int compter() {
        return service.lister().size();
    }

    @GET
    //@Path("/liste")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Produit> lister() {
        return service.lister();
    }

}
