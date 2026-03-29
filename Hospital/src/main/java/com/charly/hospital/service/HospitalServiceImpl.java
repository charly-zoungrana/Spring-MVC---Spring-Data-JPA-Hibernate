package com.charly.hospital.service;

import com.charly.hospital.entities.Consultation;
import com.charly.hospital.entities.Medecin;
import com.charly.hospital.entities.Patient;
import com.charly.hospital.entities.RendezVous;
import com.charly.hospital.repositories.ConsultationRepository;
import com.charly.hospital.repositories.MedecinRepository;
import com.charly.hospital.repositories.PatientRepository;
import com.charly.hospital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private final PatientRepository patientRepository;
    private final MedecinRepository medecinRepository;
    private final RendezVousRepository rendezVousRepository;
    private final ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient getPatientByNom(String nom) {
        return patientRepository.findByNom(nom);
    }

    @Override
    public Medecin getMedecinByNom(String nom) {
        return medecinRepository.findByNom(nom);
    }

    @Override
    public RendezVous getRDVById(String id) {
        return rendezVousRepository.findById(id).orElse(null);
    }

    @Override
    public Consultation getConsultationById(Long id) {
        return consultationRepository.findById(id).orElse(null);
    }
}
