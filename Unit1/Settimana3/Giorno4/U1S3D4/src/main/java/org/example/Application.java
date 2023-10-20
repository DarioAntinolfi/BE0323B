package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1S3D4");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
        em.close();
        emf.close();
    }

}
