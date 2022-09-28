package com.luismedeiros.lrepasapi.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@JsonRootName("cuisine")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cuisine {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@JsonIgnore
    @Column(nullable = false)
    private String nom;

}
