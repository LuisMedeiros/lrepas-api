package com.luismedeiros.lrepasapi.jpa;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class InscrireCuisine {

    @PersistenceContext
    private EntityManager manager;


}
