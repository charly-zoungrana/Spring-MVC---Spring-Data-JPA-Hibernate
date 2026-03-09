package com.charly.hospital.repositories;

import com.charly.hospital.entities.Medecin;
import com.charly.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
