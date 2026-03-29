package com.charly.hospital.repositories;

import com.charly.hospital.entities.Patient;
import com.charly.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
