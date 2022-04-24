package peaksoft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.configurations.HibernateDatabaseConnection;
import peaksoft.entities.SuperHero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        SessionFactory sessionFactory = HibernateDatabaseConnection.createSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        session.beginTransaction();
//
//        session.persist(new SuperHero());
//
//        session.getTransaction().commit();
//
//        session.close();
//        sessionFactory.close();

        EntityManagerFactory entityManagerFactory = HibernateDatabaseConnection.createEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(new SuperHero());

        entityManager.getTransaction().commit();

        entityManager.close();

        entityManagerFactory.close();
    }
}
