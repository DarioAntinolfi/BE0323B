package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.Entity.ElementiCatalogo;
import org.example.Entity.Libri;

public class Application {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1S3D5");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
        Libri libro1 = new Libri("Il re leone", 2000, 48, "Raffaele", "Comico");


        em.close();
        emf.close();
    }
}
