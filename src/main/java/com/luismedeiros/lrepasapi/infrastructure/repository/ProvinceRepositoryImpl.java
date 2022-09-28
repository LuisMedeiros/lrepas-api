package com.luismedeiros.lrepasapi.infrastructure.repository;

import com.luismedeiros.lrepasapi.domain.model.Cuisine;
import com.luismedeiros.lrepasapi.domain.model.Province;
import com.luismedeiros.lrepasapi.domain.repository.ProvinceRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class ProvinceRepositoryImpl implements ProvinceRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Province> lister() {
        return manager.createQuery("from Province", Province.class ).getResultList();
    }
}
