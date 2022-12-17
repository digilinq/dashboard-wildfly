package org.digilinq.platform.dashboard.config;

import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Singleton
public class EntityManagerConfig  {

    @PersistenceContext(unitName = "default")
    private EntityManager em;



}
