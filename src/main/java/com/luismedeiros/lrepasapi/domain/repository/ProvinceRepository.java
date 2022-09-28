package com.luismedeiros.lrepasapi.domain.repository;


import com.luismedeiros.lrepasapi.domain.model.Cuisine;
import com.luismedeiros.lrepasapi.domain.model.Province;

import java.util.List;

public interface ProvinceRepository {

    List<Province> lister();
}
