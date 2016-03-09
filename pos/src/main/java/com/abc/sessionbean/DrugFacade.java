/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.sessionbean;

import com.abc.entity.Drug;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ravisarani
 */
@Stateless
public class DrugFacade extends AbstractFacade<Drug> {
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DrugFacade() {
        super(Drug.class);
    }
    
}
