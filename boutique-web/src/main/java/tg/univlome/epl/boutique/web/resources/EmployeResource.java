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
import tg.univlome.epl.boutique.api.Employe;
import tg.univlome.epl.boutique.service.EmployeService;

/**
 *
 * @author setodji
 */
@Path("/employe")
public class EmployeResource {
    
    private EmployeService service;

    public EmployeResource() {
        this.service = EmployeService.getInstance();
    }
    
    @PUT
    @Consumes({"application/json", "application/xml"})
    public void ajouter(Employe employe) {
        this.service.ajouter(employe);
    } 

    @POST
    public void modifier(Employe employe) {
        this.service.modifier(employe);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Employe trouver(long id) {
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
    public List<Employe> lister() {
        return service.lister();
    }
    
}
