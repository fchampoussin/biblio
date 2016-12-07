package com.miage.biblio;

import com.miage.biblio.Livre;
import com.miage.biblio.TypeAuteur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T15:50:13")
@StaticMetamodel(Auteur.class)
public class Auteur_ extends Personne_ {

    public static volatile SingularAttribute<Auteur, String> nationalite;
    public static volatile SingularAttribute<Auteur, String> aProposDe;
    public static volatile SingularAttribute<Auteur, TypeAuteur> type;
    public static volatile ListAttribute<Auteur, Livre> livres;

}