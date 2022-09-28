package com.luismedeiros.lrepasapi.infrastructure.repository;

import com.luismedeiros.lrepasapi.domain.model.Cuisine;
import com.luismedeiros.lrepasapi.domain.repository.CuisineRepository;
import com.sun.xml.bind.v2.TODO;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CuisineRepositoryImpl implements CuisineRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cuisine> lister() {
        return manager.createQuery("from Cuisine", Cuisine.class ).getResultList();
    }

 //TODO implementar exception
    @Override
    public Cuisine trouverParId(long cuisineId) {
        return manager.createQuery("from Cuisine where id = " + cuisineId, Cuisine.class ).getSingleResult();
    }

    @Transactional
    @Override
    public Cuisine enregistrer(Cuisine cuisine) {
        return manager.merge(cuisine);
    }
}
