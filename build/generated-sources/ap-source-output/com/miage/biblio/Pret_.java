package com.miage.biblio;

import com.miage.biblio.Livre;
import com.miage.biblio.Users;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T16:08:00")
@StaticMetamodel(Pret.class)
public class Pret_ { 

    public static volatile SingularAttribute<Pret, Date> debut;
    public static volatile SingularAttribute<Pret, Integer> Duree;
    public static volatile SingularAttribute<Pret, Long> id;
    public static volatile SingularAttribute<Pret, Users> user;
    public static volatile SingularAttribute<Pret, Livre> livre;

}