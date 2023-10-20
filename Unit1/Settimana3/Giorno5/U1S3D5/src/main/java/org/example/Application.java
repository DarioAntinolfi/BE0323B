package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");

        em.close();
        emf.close();
    }
}
