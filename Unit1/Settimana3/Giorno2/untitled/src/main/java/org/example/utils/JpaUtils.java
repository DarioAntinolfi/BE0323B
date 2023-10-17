package org.example.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    private static final EntityManagerFactory entityManagerFactory;
    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("simplejpa");
        } catch (Throwable ex) {
            System.err.println("Inizial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
