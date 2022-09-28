package com.luismedeiros.lrepasapi.domain.repository;

import com.luismedeiros.lrepasapi.domain.model.Cuisine;

import java.util.List;

public interface CuisineRepository {

    List<Cuisine> lister();

    Cuisine trouverParId(long cuisinesId);

    Cuisine enregistrer(Cuisine cuisine);
}
