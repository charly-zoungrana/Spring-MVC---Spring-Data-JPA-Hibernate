package com.charly.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RendezVous {
    @Id
    private String id;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private StatusRDV statusRDV;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy="rendezVous")
    private Consultation consultation;
}
