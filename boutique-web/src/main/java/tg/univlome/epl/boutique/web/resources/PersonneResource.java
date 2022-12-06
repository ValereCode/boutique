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
    public void ajouter(Personne personne) {
        this.service.ajouter(personne);
    } 

    @POST
    public void modifier(Personne personne) {
        this.service.modifier(personne);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Personne trouver(long id) {
        return this.service.trouver(id);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Path("/liste")
    public List<Personne> lister() {
        return service.lister();
    }
    
}
