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
import tg.univlome.epl.boutique.api.ProduitAchete;
import tg.univlome.epl.boutique.service.ProduitAcheteService;

/**
 *
 * @author setodji
 */
@Path("/produitachete")
public class ProduitAcheteResource {
    
    private ProduitAcheteService service;

    public ProduitAcheteResource() {
        this.service = ProduitAcheteService.getInstance();
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void ajouter( ProduitAchete categorie) {
        this.service.ajouter(categorie);
    } 

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void modifier(ProduitAchete categorie) {
        this.service.modifier(categorie);
    }

    @DELETE
    @Path("/{id}")
    public void supprimer(@PathParam("id") String libelle) {
        this.service.supprimer(libelle);
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ProduitAchete trouver(@PathParam("id") String libelle) {
        return this.service.trouver(libelle);
    }

    @GET
    @Path("/longueur")
    public int compter() {
        return service.lister().size();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<ProduitAchete> lister() {
        return service.lister();
    }
    
}
