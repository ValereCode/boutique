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
import tg.univlome.epl.boutique.api.Achat;
import tg.univlome.epl.boutique.service.AchatService;

/**
 *
 * @author setodji
 */
@Path("/achat")
public class AchatResource {
    
    private AchatService service;

    public AchatResource() {
        this.service = AchatService.getInstance();
    }
    
    @PUT
    @Consumes({"application/json", "application/xml"})
    public void ajouter(Achat achat) {
        this.service.ajouter(achat);
    } 

    @POST
    public void modifier(Achat achat) {
        this.service.modifier(achat);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Achat trouver(long id) {
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
    public List<Achat> lister() {
        return service.lister();
    }
    
}
