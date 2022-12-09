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
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void ajouter(Categorie categorie) {
        this.service.ajouter(categorie);
    } 

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void modifier(Categorie categorie) {
        this.service.modifier(categorie);
    }

    @DELETE
    @Path("/{id}")
    public void supprimer(@PathParam("id") long id) {
        this.service.supprimer(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Categorie trouver(@PathParam("id") long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categorie> lister() {
        return service.lister();
    }
    
}
