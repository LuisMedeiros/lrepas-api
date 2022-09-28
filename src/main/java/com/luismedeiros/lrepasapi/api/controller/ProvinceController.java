package com.luismedeiros.lrepasapi.api.controller;

import com.luismedeiros.lrepasapi.domain.model.Province;
import com.luismedeiros.lrepasapi.domain.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceRepository provinceRepository;

    @GetMapping
    public List<Province> lister() {
        return provinceRepository.lister();
    }
}
