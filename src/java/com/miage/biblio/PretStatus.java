/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.biblio;

/**
 *
 * @author edou
 */
public enum PretStatus {
    ENATTENTE (0), 
    VALIDE(1), 
    REMIS(2); 

    private PretStatus(int status) {
        this.status= status;
    }
    int status;
    
    
}
