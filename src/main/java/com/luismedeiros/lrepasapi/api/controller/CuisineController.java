package com.luismedeiros.lrepasapi.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luismedeiros.lrepasapi.domain.model.Cuisine;
import com.luismedeiros.lrepasapi.domain.repository.CuisineRepository;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cuisines")
public class CuisineController {

    @Autowired
    private CuisineRepository cuisineRepository;

    @GetMapping
    public List<Cuisine> lister() {
        return cuisineRepository.lister();
    }

    @GetMapping("/{cuisineId}")
    public ResponseEntity<Cuisine> trouverParId(@PathVariable long cuisineId) {
        try {
            return ResponseEntity
                    .ok(cuisineRepository.trouverParId(cuisineId));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cuisine> ajouter(@RequestBody Cuisine cuisine) {
        try {
            return ResponseEntity
                    .ok(cuisineRepository.enregistrer(cuisine));
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @PutMapping("/{cuisineId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<String> actualiser(@PathVariable long cuisineId, @RequestBody Cuisine cuisine) {

        try {
            Cuisine cuisineActuel = cuisineRepository.trouverParId(cuisineId);

            BeanUtils.copyProperties(cuisine, cuisineActuel, "id");
            cuisineActuel = cuisineRepository.enregistrer(cuisineActuel);
            return ResponseEntity.ok(new ObjectMapper().writeValueAsString(cuisineActuel));//"La Cuisine Actualisée!"
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }

    }

}
