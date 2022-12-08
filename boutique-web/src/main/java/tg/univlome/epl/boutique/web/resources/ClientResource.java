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
import tg.univlome.epl.boutique.api.Client;
import tg.univlome.epl.boutique.service.ClientService;

/**
 *
 * @author setodji
 */
@Path("/client")
public class ClientResource {
    
    private ClientService service;

    public ClientResource() {
        this.service = ClientService.getInstance();
    }
    
    @PUT
    @Consumes({"application/json", "application/xml"})
    public void ajouter(Client client) {
        this.service.ajouter(client);
    } 

    @POST
    public void modifier(Client client) {
        this.service.modifier(client);
    }

    @DELETE
    public void supprimer(long id) {
        this.service.supprimer(id);
    }
    
    @GET
    public Client trouver(long id) {
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
    public List<Client> lister() {
        return service.lister();
    }
    
}
