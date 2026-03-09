package com.charly.hospital.repositories;

import com.charly.hospital.entities.Consultation;
import com.charly.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
