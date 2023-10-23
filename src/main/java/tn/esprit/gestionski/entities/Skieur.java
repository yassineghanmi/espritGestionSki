package tn.esprit.gestionski.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;
    private String ville;
    @OneToOne
    private Abonnement abonnement;
    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
}
