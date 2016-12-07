/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.biblio.beans;

import com.miage.biblio.Pret;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author florian
 */
@Stateless
public class PretFacade extends AbstractFacade<Pret> {
    @PersistenceContext(unitName = "BiblioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PretFacade() {
        super(Pret.class);
    }
    
}
