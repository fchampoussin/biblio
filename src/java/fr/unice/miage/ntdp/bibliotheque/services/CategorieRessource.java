/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services;

import com.miage.biblio.Categorie;
import com.miage.biblio.beans.AbstractFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author florian
 */
@Path("catégorie")
public class CategorieRessource extends AbstractFacade<Categorie> {
    public CategorieRessource(){
        super(Categorie.class);
    }
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String hello(){
        return "La ressource demandée existe!";
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Categorie> list(){
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
