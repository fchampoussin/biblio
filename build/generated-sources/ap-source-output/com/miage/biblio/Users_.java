package com.miage.biblio;

import com.miage.biblio.AccountStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T16:08:00")
@StaticMetamodel(Users.class)
public class Users_ extends Personne_ {

    public static volatile SingularAttribute<Users, String> motDePasse;
    public static volatile SingularAttribute<Users, AccountStatus> statutCompte;
    public static volatile SingularAttribute<Users, String> nomUtilisateur;
    public static volatile SingularAttribute<Users, Date> derniereConnexion;

}