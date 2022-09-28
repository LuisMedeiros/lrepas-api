package com.luismedeiros.lrepasapi.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

//@EqualsAndHashCode
//@Getter
//@Setter
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurant {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private BigDecimal fret;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cuisine cuisine;

    @ManyToOne
    private ModePaiement modePaiement;
}
