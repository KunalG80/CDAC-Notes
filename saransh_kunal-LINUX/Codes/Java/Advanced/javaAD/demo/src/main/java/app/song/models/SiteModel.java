package app.song.models;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.metamodel.Type.PersistenceType;

public class SiteModel{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");
}