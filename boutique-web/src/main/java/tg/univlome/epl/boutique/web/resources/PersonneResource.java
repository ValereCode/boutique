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
import tg.univlome.epl.boutique.api.Personne;
import tg.univlome.epl.boutique.service.PersonneService;

/**
 *
 * @author setodji
 */
@Path("/personne")
public class PersonneResource {
    
    private PersonneService service;

    public PersonneResource() {
        this.service = PersonneService.getInstance();
    }
    
    @PUT
    //@Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void ajouter(Personne personne) {
        this.service.ajouter(personne);
    } 

    @POST
    //@Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void modifier(Personne personne) {
        this.service.modifier(personne);
    }

    @DELETE
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void supprimer(@PathParam("id") long id) {
        this.service.supprimer(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Personne trouver(@PathParam("id") long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Personne> lister() {
        return service.lister();
    }
    
}
