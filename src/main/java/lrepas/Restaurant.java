package lrepas;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Restaurant {
    private long id;
    private BigDecimal fret;
    private String nom;
    private long cuisineId;
    private Long modePaiementId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fret")
    public BigDecimal getFret() {
        return fret;
    }

    public void setFret(BigDecimal fret) {
        this.fret = fret;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "cuisine_id")
    public long getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(long cuisineId) {
        this.cuisineId = cuisineId;
    }

    @Basic
    @Column(name = "mode_paiement_id")
    public Long getModePaiementId() {
        return modePaiementId;
    }

    public void setModePaiementId(Long modePaiementId) {
        this.modePaiementId = modePaiementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id && cuisineId == that.cuisineId && Objects.equals(fret, that.fret) && Objects.equals(nom, that.nom) && Objects.equals(modePaiementId, that.modePaiementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fret, nom, cuisineId, modePaiementId);
    }
}
