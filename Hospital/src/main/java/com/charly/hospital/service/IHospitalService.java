package com.charly.hospital.service;

import com.charly.hospital.entities.Consultation;
import com.charly.hospital.entities.Medecin;
import com.charly.hospital.entities.Patient;
import com.charly.hospital.entities.RendezVous;

public interface IHospitalService {

    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
    Patient getPatientById(Long id);
    Patient getPatientByNom(String nom);
    Medecin getMedecinByNom(String nom);
    RendezVous getRDVById(String id);
    Consultation getConsultationById(Long id);

}
