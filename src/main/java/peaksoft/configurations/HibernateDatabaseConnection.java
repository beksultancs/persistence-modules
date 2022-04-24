package peaksoft.configurations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.entities.SuperHero;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Beksultan
 */
public class HibernateDatabaseConnection {

    // there we have to way to manage data with hibernate
    // 1. Session
    // 2. EntityManager
    // And we have to write two database configurations

    public static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();

        configuration.configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(SuperHero.class);

        return configuration.buildSessionFactory();
    }

    public static EntityManagerFactory createEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("CRM");
    }
}
