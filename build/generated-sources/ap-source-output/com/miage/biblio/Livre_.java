package com.miage.biblio;

import com.miage.biblio.Auteur;
import com.miage.biblio.Categorie;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T16:08:00")
@StaticMetamodel(Livre.class)
public class Livre_ { 

    public static volatile SingularAttribute<Livre, String> resume;
    public static volatile SingularAttribute<Livre, Categorie> categorie;
    public static volatile SingularAttribute<Livre, String> titre;
    public static volatile SingularAttribute<Livre, String> isbn;
    public static volatile SingularAttribute<Livre, Auteur> ecrit_par;
    public static volatile SingularAttribute<Livre, String> photo;
    public static volatile SingularAttribute<Livre, Long> id;
    public static volatile SingularAttribute<Livre, Date> publishedDate;
    public static volatile SingularAttribute<Livre, Integer> quantite;

}